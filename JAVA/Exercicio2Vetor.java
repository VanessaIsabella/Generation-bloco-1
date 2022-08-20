package AulaJava;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

		Scanner leia=new Scanner (System.in);
		
		int vetor[] = new int[6];
		int numPar=0, somaPar=0, numImpar=0, somaImpar=0, x;
		
		for (x=0;x<6;x++) {
			System.out.println("\nDigite um número: ");
			vetor[x] = leia.nextInt();
			if (vetor[x] % 2==0) {	
				somaPar+=vetor[x];
				System.out.println("\nO número digitado é PAR!");
			}
			else {
				somaImpar++;
				System.out.println("\nO número digitado é ÍMPAR");
		}			
		}
			System.out.println("\nA soma de números pares digitados é: "+somaPar);
			System.out.println("\nA quantidade de números ímpares digitados é: "+somaImpar);
	
		}
		}

