package pl.writeonly.pastabean.appc.config;

import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.writeonly.pasta.bean.daos.ConfigurationDao;
import pl.writeonly.pasta.bean.daos.MessageDao;
import pl.writeonly.pasta.bean.temp.Crud;
import pl.writeonly.pasta.bean.temp.JdoDaoCrud;
import pl.writeonly.pastabean.pojo.Message;

@Configuration
public class DaoConfig {

	@Bean
	public PersistenceManagerFactory persistanceManagerFactory() {
		Properties properties = new Properties();
		properties.setProperty("javax.jdo.PersistenceManagerFactoryClass", "org.datanucleus.api.jdo.JDOPersistenceManagerFactory");
		properties.setProperty("javax.jdo.option.ConnectionURL","jdbc:mysql://localhost/myDB");
		properties.setProperty("javax.jdo.option.ConnectionDriverName","com.mysql.jdbc.Driver");
		properties.setProperty("javax.jdo.option.ConnectionUserName","login");
		properties.setProperty("javax.jdo.option.ConnectionPassword","password");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(properties);
		return pmf;
	}
	
	@Bean
	public <T> Crud<T> crud() {
		return new JdoDaoCrud<T>(persistanceManagerFactory());
	}

	@Bean
	public ConfigurationDao configurationDao() {
		return new ConfigurationDao((Configuration)crud());
	}
	
	@Bean
	public MessageDao meassageDao() {
		return new MessageDao(crud(), Message.class);
	}

}
