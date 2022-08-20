package testeJava;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		/* Faça um programa que entre com três números e coloque em ordem crescente.*/
		/* 1º  2º  3º
		 * num1   num2   num3
		 * num2   num3   num1
		 * num3   num2   num1
		 * num3   num1   num2
		 * num1   num3   num2
		 * num2   num1   num3/*
		 */
		
		Scanner leia=new Scanner (System.in);
		int num1,num2,num3;
		System.out.println("\nDigite o primeiro número: ");
		num1=leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2=leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		num3=leia.nextInt();
		
		if (num1<=num2 && num2<=num3) {
			System.out.println("\nOrdem crescente é: "+num2+" , "+num1+" , "+num3+"");{
				if (num2<=num3 && num3<=num1);
				System.out.println("\nOrdem crescente é: "+num2+" , "+num3+" , "+num1+"");{
					if (num3<=num2 && num2<=num1);
					System.out.println("\nOrdem crescente é: "+num3+" , "+num2+" , "+num1+"");{
						if (num3<=num1 && num1<=num2);
						System.out.println("\nOrdem crescente é: "+num3+" , "+num1+" , "+num2+"");{
							if (num1<=num3 && num3<=num2);
							System.out.println("\nOrdem crescente é: "+num1+" , "+num3+" , "+num2+"");
						}	
					}
				}
			}
			
			
		}
			
		else if (num2<=num1 && num1<=num3);
		System.out.println("\nOrdem crescente é: "+num2+" , "+num1+" , "+num3+"");

	}

}
