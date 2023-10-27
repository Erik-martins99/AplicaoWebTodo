package com.erik.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erik.todo.domain.Todo;
import com.erik.todo.repositorys.TodoRepository;

@Service
public class DBservices {

	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("25/03/2022"), false);
		
		todoRepository.saveAll(Arrays.asList(t1));
	}
	
	public void instanciaCloseBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t2 = new Todo(null, "Ser foda em Java", "Para dá orgulho para minha mãe", sdf.parse("19/10/2023"), true);
		
		todoRepository.saveAll(Arrays.asList(t2));
	}
}
