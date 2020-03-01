package es.netsan.saranbula.controller.frontal;

import javax.faces.bean.ManagedBean;

import es.netsan.saranbula.model.dto.UserDto;
import es.netsan.saranbula.util.Constants;
import es.netsan.saranbula.util.Util;

@ManagedBean
public class LoginBean extends AppManagedBean {
	
	private UserDto userDto = new UserDto();
	
	public LoginBean() {
		// empty constructor
	}
	
	public void doLogin() {
		if(datosLoginValidos()) {
			
		} else {
			// controlar error
		}
	}

	private boolean datosLoginValidos() {
		String username = userDto.getUsername();
		String password = userDto.getPassword();
		
		if(Util.isNullOrBlank(username) || (Util.isNullOrBlank(password))) {
			return Constants.FALSE_BOOLEANVALUE;
		}
		
		if(username.length() > 20) {
			return Constants.FALSE_BOOLEANVALUE;
		}
		
		int passwordLenght = password.length();
		if(passwordLenght > 16 || passwordLenght < 8) {
			return Constants.FALSE_BOOLEANVALUE;
		}
		
		return Constants.TRUE_BOOLEANVALUE;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
}