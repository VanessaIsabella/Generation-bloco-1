package SequenciasBasicas;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/
		
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, soma=0;
		System.out.println("\nInforme o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nInforme o segundo número: ");
		num2 = leia.nextInt();
		
		soma=num1+num2;
		System.out.println("\nA soma entre " +num1+ " e " +num2+ " é: "+soma);
		

	}

}
