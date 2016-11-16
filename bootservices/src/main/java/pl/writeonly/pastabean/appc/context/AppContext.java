package pl.writeonly.pastabean.appc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.writeonly.pasta.bean.serv.Pasta;
import pl.writeonly.pastabean.appc.config.AppConfig;
import pl.writeonly.pastabean.appc.config.DaoConfig;

public class AppContext {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, DaoConfig.class);
		Pasta obj = context.getBean(Pasta.class);

		obj.printHelloWorld("Spring3 Java Config");

	}
}
