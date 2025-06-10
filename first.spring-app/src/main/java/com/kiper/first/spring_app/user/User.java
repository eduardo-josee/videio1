package com.kiper.first.spring_app.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter //todos esses tres 
@Setter // sao metodos do lombok feito pra facilitar os codigos 
@AllArgsConstructor // assim n e preciso fazer tudo na mao 
public class User {
	private String nome; //nome do user 
	private String email; // email do user 
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	
 
	 
 
	}

