package SequenciasBasicas;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/
		
		Scanner leia = new Scanner(System.in);
		int numero=0, antecessor=0, sucessor=0;
		System.out.println("\nInforme um número: ");
		numero = leia.nextInt();
		
		antecessor=numero-1; //subtrai do número informado pelo usuário 
		sucessor=numero+1; //adiciona ao número informado pelo usuário
		
		System.out.println("\nO antecessor de " +numero+ " é " +antecessor);
		System.out.println("\nO sucessor de " +numero+ " é " +sucessor);

	}

}
