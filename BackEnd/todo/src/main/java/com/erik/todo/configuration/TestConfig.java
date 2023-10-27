package com.erik.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.erik.todo.services.DBservices;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBservices dbServices;

	//@Bean
	public boolean instancia() throws ParseException {
		dbServices.instanciaBaseDeDados();
		return true;
	}
	
	//@Bean
	public boolean instanciaClose() throws ParseException {
		dbServices.instanciaCloseBaseDeDados();
		return true;
	}

}
