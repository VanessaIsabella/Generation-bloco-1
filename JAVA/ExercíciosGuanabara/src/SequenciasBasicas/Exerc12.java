package SequenciasBasicas;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada*/
		
		Scanner leia = new Scanner(System.in);
		String nome; 
		double salario=0;
		int dias, horas=8, valorHora=25;
		
		System.out.println("\nEntre com o nome do funcionário :");
		nome = leia.next();
		System.out.println("\nInforme o número de dias trabalhados :");
		dias = leia.nextInt();
		
		salario=horas*valorHora;
		salario=dias*salario;	
		
System.out.println("\nO/A funcionário(a) " +nome+ " trabalhou " +dias+ " dias. Ele(a) vai ganhar um salário de " +salario);

/*String nome = "Ana"; 
double salario= 5.770;
String dias="22";
System.out.printf("%s trabalhou %s dias e vai ganhar um salário de %d", nome, dias, salario);*/
	}
}
	




