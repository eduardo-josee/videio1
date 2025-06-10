package com.kiper.first.spring_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service // avisa ao spring que isso e uma class service
public class HelloWorldService {
	
	@GetMapping //metodo de exemplo,no video serve para testar a função do get 
	public String helloWorld(String Name) {
		return"Hello Mundo!"+ Name; // quando for pesquisar helloWorld na porta 8080 vai aparecer hello mundo + name
	}
}
