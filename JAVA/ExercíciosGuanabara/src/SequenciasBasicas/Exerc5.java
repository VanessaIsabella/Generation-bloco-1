package SequenciasBasicas;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/
		
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, soma=0, media=0;
		System.out.println("\nInforme a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nInforme a segunda nota: ");
		n2 = leia.nextFloat();
		soma=n1+n2/2; //precisa dividir as notas para obter a soma
		media=soma;
		
		System.out.println("\nA média entre " +n1+ " e " +n2+ " é igual a "+media);
		

	}

}
