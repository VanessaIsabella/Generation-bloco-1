package AulaJava;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		int [][] numeros = new int[3][2];
		float mediaNumImpar;
		int somaNumImpar=0,contNumImpar=0, i,j; //i=linha e j=coluna
		
		for(i=0;i<=3;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nDigite um número: ");
				numeros[i][j] = leia.nextInt(); 				
						if(numeros[i][j] %2 ==1){
							somaNumImpar+=numeros[i][j];
							contNumImpar++;
						}
			}
		}
		mediaNumImpar = somaNumImpar/contNumImpar;
		System.out.println("\nMédia dos números ímpares: "+mediaNumImpar);

	}

}
