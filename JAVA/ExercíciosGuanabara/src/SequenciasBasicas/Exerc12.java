package SequenciasBasicas;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada*/
		
		Scanner leia = new Scanner(System.in);
		String nome; //nome=funcionário
		double salario=0;
		int dias, horas=8, valorHora=25;
		
		System.out.println("\nEntre com o nome do funcionário :");
		nome = leia.next();
		System.out.println("\nInforme o número de dias trabalhados :");
		dias = leia.nextInt();
		
		
		
		salario = horas*=valorHora;
		
		System.out.println("\nSe o funcionário " +nome+ " trabalha " +dias+ " dias, ele(a)ganha um salário de " +salario);
		

		
		
	}

}
