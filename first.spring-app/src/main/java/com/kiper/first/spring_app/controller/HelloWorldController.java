package com.kiper.first.spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiper.first.spring_app.service.HelloWorldService;
import com.kiper.first.spring_app.user.User;

@RestController //serve para dizer que e uma class controller
@RequestMapping("/Hello_World") // serve para mapear os endepoints
public class HelloWorldController {

	@Autowired //serve para instanciar essas classes
	private HelloWorldService helloWorldService;

	@GetMapping() //metodo obter,listar.
	public String helloWorld() {
		return helloWorldService.helloWorld("Eduzera");
	}

    // CORREÇÃO AQUI: Troque 'getName()' por 'getNome()'
	@PostMapping("/{id}") //serve para criar um usuario com id
	public String helloWorldPost(@PathVariable("id") String id,@RequestBody User body) {
		return "Hello " + body.getNome() + id; // <--- MUDANÇA NESTA LINHA
	}

}