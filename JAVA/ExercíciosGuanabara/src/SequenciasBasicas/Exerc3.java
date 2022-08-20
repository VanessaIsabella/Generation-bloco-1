package SequenciasBasicas;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

		Scanner leia = new Scanner(System.in);
		String nome;
		float salario;
		System.out.println("\nQual seu nome? : ");
		nome = leia.next();
		System.out.println("\nQual seu salário? : ");
		salario = leia.nextFloat();
		
		System.out.println("\nO funcionário " +nome+ ",tem um salário de " +salario);
		
	
		
		
		
	}

}
