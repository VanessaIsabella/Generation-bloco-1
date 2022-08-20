package testeJava;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		Scanner leia = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		num3=leia.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("\nA maior pontuação é de: "+num1);
		} if (num2>num1 && num2>num3) {
			System.out.println("\nA maior pontuação é de: "+num2);
		} else if (num3>num1 && num3>num2) {
			System.out.println("\nA maior pontuação é de: "+num3);
		}
	}

}
