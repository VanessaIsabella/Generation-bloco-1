package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio3WHILE {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

		int idade, total21=0, total50=0;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();			
		
	       while (idade!=-99) {
	    	   
	    	   if (idade < 21) {
	    		   total21++;
	    	   }
					
	    	   else if (idade >50) {
	    		   total50++; 
	    		   
	    	   }
	    	   System.out.println("\nDigite a idade: ");
				idade = leia.nextInt();	
	       }   
	       
	     
			    System.out.println("\nO total de pessoas com menos de 21 anos é de : "+total21);
				System.out.println("\nO total de pessoas com mais de 50 anos é de : "+total50);
	      
			}
			 
		}
		
	

