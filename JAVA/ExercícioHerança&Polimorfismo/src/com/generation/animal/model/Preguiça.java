package com.generation.animal.model;

public class Pregui�a extends Animal{

	public Pregui�a(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}
	
	public void visualizar() {
		System.out.println("\nA pregui�a se chama " +getNome()+ " e ela tem " +getIdade()+ " anos de idade. ");
		
	}
	
	public void subir() {
		System.out.println("\n" +getNome()+ " sobe as �rvores e n�o emite som!! " );
		
	}
	

}
