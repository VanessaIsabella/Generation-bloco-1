package SequenciasBasicas;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, 
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/
		
		Scanner leia = new Scanner (System.in);
		int largura, altura, tinta, area=0;
		
		System.out.println("\nInforme a largura de sua parede :");
		largura = leia.nextInt();
		System.out.println("\nInforme a altura de sua parede :");
		altura = leia.nextInt();
		
		area=altura*largura; //o valor da area é o resultado da multiplicação dos dados informados pelo usuário
		tinta=area/2; //para descobrir quant da tinta, precisa dividir o valor da area pelo litro de tinta informada
	
		System.out.println("\nA área a ser pintada é de " +area);
		System.out.println("\nA quantidade de tinta a ser utilizada é de " +tinta+ " litros. ");
		
		

	}

}
