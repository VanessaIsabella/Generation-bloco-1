package SequenciasBasicas;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

		Scanner leia = new Scanner(System.in);
		double dinheiro;
	
		System.out.println("\nQuanto dinheiro você tem na carteira ?: ");
		dinheiro = leia.nextInt();
		
		dinheiro*=3.45; //multiplicar o valor informado pelo usuário pelo valor informado no exerc		
		
		System.out.println("\nVocê pode comprar " +dinheiro+ " dólares.");
				
	}

}
