package CondicoesBasicas;

import java.util.Scanner;

public class Exerc5 {

	/*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO.*/
	/*Anos bissextos são múltiplos de 4, não múltiplos de 100 (1900 não é bissexto) 
	 * e múltiplos de 400 (2000 é bissexto).*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		int ano;
		
		System.out.println("\nDigite um ano para saber se é bissexto ou não :)");
		ano = leia.nextInt();
		
		//ano maior que 400
		if (ano % 400 ==00) {
			System.out.println(ano+ "\n é bissexto ");
		} else if ((ano %4 ==00)&& (ano%100 !=0)) {
			System.out.println(ano+ "\n é bissexto ");
		} else {
			System.out.println(ano+ "\n é bissexto ");
		}
		
	}

}
