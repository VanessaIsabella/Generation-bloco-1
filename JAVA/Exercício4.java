package testeJava;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
		
		
		Scanner leia=new Scanner(System.in);
		int numero;
		double resultado;
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			resultado = Math.sqrt(numero);
			System.out.println("\nO número é PAR.");
		} else {
			System.out.println("\nO número é ÍMPAR. ");
			resultado = Math.pow(numero, 2);
		}
			
			System.out.println("\nA raiz quadrada desse número é " +resultado);	
		
	}
	
	

}
