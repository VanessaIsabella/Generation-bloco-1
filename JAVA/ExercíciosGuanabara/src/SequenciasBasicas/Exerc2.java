package SequenciasBasicas;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		/*) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/
		
		Scanner leia = new Scanner(System.in);
		String nome;
		System.out.println("\nQual seu nome? ");
		nome=leia.next();
		
		System.out.println("\nSeja bem vinde, "+nome);
	}

}
