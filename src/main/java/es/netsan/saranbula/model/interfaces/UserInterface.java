package es.netsan.saranbula.model.interfaces;

import java.util.Date;

public interface UserInterface {
	
	String getUsername();
	String getPassword();
	Date getBirthday();
	String getCompleteName();
	
	void setUsername(String username);
	void setPassword(String password);
	void setBirthday(Date birthday);
	void setCompleteName(String completeName);
	
}
