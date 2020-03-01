package es.netsan.saranbula.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import es.netsan.saranbula.model.interfaces.UserInterface;

@Entity(name = "TB_SAR_USERS")
public class User implements UserInterface {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Long id;
	
	@Column(name =  "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "BIRTHDAY")
	private Date birthday;
	
	@Column(name = "COMPLETE_NAME")
	private String completeName;
	
	public User() {
		// empty constructor
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
