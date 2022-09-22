package CondicoesBasicas;

import java.util.Scanner;

/*Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
não um bom aproveitamento (se ficou acima da média 7.0)*/

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double n1, n2, media;
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextDouble();
		
		media=(n1+n2)/2;
		
		if (media>=7) {
			System.out.println("\nAluno com ÓTIMO aproveitamento!!! ");			
		} else {
			System.out.println("\nSeu aproveitamento pode melhorar!!! ");
		}
		
		
		
		
	}
	
	
}
