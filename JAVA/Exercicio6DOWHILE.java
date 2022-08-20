package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio6DOWHILE {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		
		float media;
		int numero, somaMult3=0, contMult3=0;
		Scanner leia=new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if (numero % 3 ==0) {
				System.out.println("Obrigada :) ");
			} 
			else
			{
				if(numero %3 == 0) {
					somaMult3 +=numero;
					contMult3++;
				}
				
			}
			
		} while (numero!=0);
		if(contMult3==0) {
			System.out.println("\nNão é possível fazer divisão por zero!");
		}
		else {
			media=somaMult3 / contMult3;
			System.out.println("\nA média dos números é: "+media);
		}
		
	}

}


/*Scanner leia=new Scanner(System.in);

do {
	System.out.println("\nDigite um número: ");
	numero = leia.nextInt();
	somaValor+=numero;
}
while (numero!=0);
System.out.println("\nSomatória dos números é de: "+somaValor);*/
	
	