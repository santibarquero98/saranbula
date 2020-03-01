package es.netsan.saranbula.model.dto;

import java.util.Date;

import es.netsan.saranbula.model.interfaces.UserInterface;

public class UserDto implements AbstractDto<UserDto>, UserInterface {
	
	private String username;
	private String password;
	private Date birthday;
	private String completeName;
	
	public UserDto(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public UserDto() {
		// constuctor vacio
	}

	@Override
	public String getTableName() {
		return null;
	}

	@Override
	public UserDto getNew() {
		return new UserDto();
	}

	@Override
	public UserDto copy() {
		// TODO: Not implemented method
		return null;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public Date getBirthday() {
		return this.birthday;
	}

	@Override
	public String getCompleteName() {
		return this.completeName;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
		
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
		
	}

	@Override
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
		
	}

	@Override
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
		
	}
}