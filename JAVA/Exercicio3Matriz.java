package AulaJava;

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		/*- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		
		Scanner leia=new Scanner(System.in);
		
		int [][]matriz = new int[3][3]; 
		int l, c, cont10=0;    //l=linha e c=coluna
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("\nDigite um número: ");
				matriz[l][c] = leia.nextInt();
				
				if(matriz[l][c]>=10) {
	            	cont10++;	
	            }
				
				}
			}
		            
		        
		System.out.println("\nA quantidade de valores maior que 10 é de :"+cont10);
		
	}
}
