package CondicoesBasicas;

import java.util.Scanner;

public class Exerc4 {

	/*Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou 
ÍMPAR.*/
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num;
		
		System.out.println("\nDigite um número : ");
		num = leia.nextInt();
		
		if (num%2==0) {
			System.out.println("\nO número é PAR ");
		} else {
			System.out.println("\nO número é ÍMPAR ");
		}

	}

}
