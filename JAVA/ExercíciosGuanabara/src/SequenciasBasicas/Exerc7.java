package SequenciasBasicas;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte.
Ex: 
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/
		
		Scanner leia = new Scanner (System.in);
		float numero;
		
		System.out.println("\nInforme um número :");
		numero = leia.nextFloat();
		System.out.println("\nO dobro de " +numero+ " é " +numero*2); //multiplicar o result por 2 para ter o dobro
		System.out.println("\nA terça parte de " +numero+ " é " +numero/3); //dividir o result por 3 para ter o terço
	
	}

}
