package CondicoesBasicas;

import java.util.Scanner;

public class Exerc2 {
	
	/*Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
dela e depois mostre se ela pode ou não votar*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoNasc, idade;
		
		System.out.println("\nEm que ano você nasceu? ");
		anoNasc = leia.nextInt();
		
		idade=2022-anoNasc;
		
		System.out.println("\nSua idade é: " +idade);
		
		if (idade <18) {
			System.out.println("\nVocê não pode votar ainda!!");			
		}
		
		if (idade>=18){
			System.out.println("\nVocê tem idade para votar!!!!! :)");
			
		}
		

	}

}
