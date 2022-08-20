package SequenciasBasicas;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento.*/
		
		Scanner leia = new Scanner (System.in);
		String nome;
		double salario, aumento=0, novoSalario=0;
		
		System.out.println("\nInforme seu nome :");
		nome = leia.next();
		System.out.println("\nInforme o seu salário :");
		salario = leia.nextDouble();
		
		novoSalario=salario*15/100;	
		novoSalario=salario+novoSalario;
//precisa sempre multiplicar o valor informado pelo usuário
//pela % informada e dividir por 100, para ter o %
//a nova info que eu quero, é resultado da soma/subt/divi/mult feita a partir da %
		
		System.out.println("\nOlá " +nome+ 
				", o seu novo salário com 15% de aumento é de : " +novoSalario);
	}

}
