package SequenciasBasicas;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto.*/
		
		Scanner leia = new Scanner (System.in);
		double produto, desconto=0, promo=0;
		System.out.println("\nInforme o valor do produto :");
		produto = leia.nextDouble();
		
		desconto=produto*5/100; 
		promo=produto-desconto;
//precisa multiplicar o valor informado pelo usuário, pelo valor do desconto%, e dividir por 100
//para virar porcentagem		
		
		System.out.println("\nO valor promocional é de : " +promo);

	}

}
