package com.kiper.first.spring_app.configuration;

import javax.swing.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marcamos a classe como uma classe de configuração para o Spring.
public class HelloWorldConfiguration { // Damos um nome claro para a nossa classe de configuração.

	@Bean // Essa anotação diz ao Spring: "O método abaixo vai criar um objeto
	      // que você, Spring, deve gerenciar e disponibilizar para outras partes do meu aplicativo."
	public String helloWorld() { // Este é um método simples que vai retornar uma String.
		return "Hello World"; // O valor que esse "bean" vai ter é a famosa frase "Hello World".
    }

}