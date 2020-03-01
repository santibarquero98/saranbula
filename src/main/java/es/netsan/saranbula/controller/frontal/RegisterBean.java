package es.netsan.saranbula.controller.frontal;

import javax.faces.bean.ManagedBean;

import es.netsan.saranbula.model.dto.UserDto;

@ManagedBean
public class RegisterBean extends AppManagedBean {
	
	private UserDto userDto = new UserDto();
	
	public RegisterBean() {
		// empty constructor
	}
	
	public void register() {
		if(datosRegistroValidos()) {
			
		} else {
			// controlar error
		}
	}

	private boolean datosRegistroValidos() {
		// TODO Auto-generated method stub
		return false;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
}