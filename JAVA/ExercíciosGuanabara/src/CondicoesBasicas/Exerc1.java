package CondicoesBasicas;

import java.util.Scanner;

public class Exerc1 {
	
	public static void main(String[] args) {
	/*Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.*/

		Scanner leia = new Scanner (System.in);
		
		int velocidade, multa, excesso=0;
		
		System.out.println("\nQual a velocidade do seu carro? ");
		velocidade = leia.nextInt();
		
		if (velocidade > 80);{
			excesso = velocidade - 80;
			multa = excesso*5;
		}
		
		System.out.println("\nO excesso de velocidade!! Multa de R$" +multa);
		
		
		
		
		
		
		
		
		
		
		
	}

}
