package ExerciciosRepeticao;

import java.util.Scanner;

class Exercicio5DOWHILE {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
		
		int numero, somaValor=0;
		Scanner leia=new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			somaValor+=numero;
		}
		while (numero!=0);
		System.out.println("\nSomatória dos números é de: "+somaValor);
			
			

		

	}

}
