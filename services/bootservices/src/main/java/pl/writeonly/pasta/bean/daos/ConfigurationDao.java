package pl.writeonly.pasta.bean.daos;

import pl.writeonly.pasta.bean.temp.Crud;
import pl.writeonly.pastabean.pojo.Configuration;

public class ConfigurationDao {

	Crud<Configuration> crud;

	public ConfigurationDao(Crud<Configuration> crud) {
		this.crud = crud;
	}
}
