package com.generation.animal.model;

public class Cachorro extends Animal{
	
	
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	public void visualizar() {
		System.out.println("\nMeu cachorro se chama " +getNome()+ " e ele tem " +getIdade()+ " anos de idade. ");
	}
	
	public void correr() {
		System.out.println("\n" + getNome() + " está correndo!!!!!!!");
	}
	
	public void som() {
		System.out.println("\n" + getNome() + " emite o som au au!!");
	}
	
	
	}
	
	
	

