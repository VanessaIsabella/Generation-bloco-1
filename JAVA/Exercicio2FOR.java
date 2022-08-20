package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio2FOR {

	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
		
		int numeros=0, Par=0, Impar=0, x;
		Scanner leia =new Scanner(System.in);

		for (x=1;x<=3;x++) {
			System.out.println("\nDigite um número: ");
			numeros = leia.nextInt();
		
		   if (numeros % 2 == 0)		   
			   Par++;
		   
		   else 
	              Impar++;	}
	              
	              System.out.println("\nA quantidade de números Pares é de: "+Par);
	              System.out.println("\nA quantidade de número Ímpares é de: "+Impar);
		}
	             
		
	}


