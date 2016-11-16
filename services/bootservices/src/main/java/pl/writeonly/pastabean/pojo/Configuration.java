package pl.writeonly.pastabean.pojo;

import javax.jdo.annotations.PersistenceCapable;

import lombok.Data;

@Data
@PersistenceCapable
public class Configuration extends Base {
	String url;
	String user;
	String password;
}