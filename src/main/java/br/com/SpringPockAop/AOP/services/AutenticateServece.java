package br.com.SpringPockAop.AOP.services;

import org.springframework.stereotype.Service;

import br.com.SpringPockAop.AOP.dto.UserDTO;

@Service
public class AutenticateServece {

	public String LogUserNamePassword(UserDTO dto) {
		
		System.out.println("User: " + dto.getUser());
		System.out.println("Password: " + dto.getPassword());
		
		String UserPass = "User: "+ dto.getUser() + "PassWord" + dto.getPassword();
		
		return UserPass;
	}
	
}
