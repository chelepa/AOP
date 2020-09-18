package br.com.SpringPockAop.AOP.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String User;
	
	private String Password;
	
	public UserDTO(String User, String Password) {
		this.setUser(User);
		this.setPassword(Password);
	}

	
}

