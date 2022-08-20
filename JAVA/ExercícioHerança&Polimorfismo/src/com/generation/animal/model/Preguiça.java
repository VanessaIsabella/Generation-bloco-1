package com.generation.animal.model;

public class Preguiça extends Animal{

	public Preguiça(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	public void visualizar() {
		System.out.println("\nA preguiça se chama " +getNome()+ " e ela tem " +getIdade()+ " anos de idade. ");
		
	}
	
	public void subir() {
		System.out.println("\n" +getNome()+ " sobe as árvores e não emite som!! " );
		
	}
	

}
