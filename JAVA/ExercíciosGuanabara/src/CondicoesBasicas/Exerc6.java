package CondicoesBasicas;

import java.util.Scanner;

public class Exerc6 {

	/*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento.
*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anoNasc, idade, anoAlis;
		
		System.out.println("\nDigite o seu ano de nascimento: ");
		anoNasc = leia.nextInt();
		
		idade=2022-anoNasc;
		
		if (idade==18) {
			System.out.println("\nEsse é seu ano de alistamento!!! ");
			
		}
		
		if (idade<18) {
			anoAlis=18-idade;
			System.out.println("\nFaltam " +anoAlis+ " anos para o alistamento. ");
		}
			
		if (idade>18) {
			anoAlis=idade-18;
			System.out.println("\nJá se passaram " +anoAlis+ " anos de alistamento. ");
		}
		

	}

}
