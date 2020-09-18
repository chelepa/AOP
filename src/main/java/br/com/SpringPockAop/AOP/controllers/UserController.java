package br.com.SpringPockAop.AOP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SpringPockAop.AOP.dto.UserDTO;
import br.com.SpringPockAop.AOP.services.AutenticateServece;

@RestController
public class UserController {
	
	@Autowired
	private AutenticateServece autenticateServece; 
	
	@PostMapping(value = "/v1/autenticate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getUserPassword(@RequestBody UserDTO dto){
		System.out.println(dto);
		return ResponseEntity.status(HttpStatus.OK).body(autenticateServece.LogUserNamePassword(dto));
	}

}
