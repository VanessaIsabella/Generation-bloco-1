package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio4WHILE {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos*/
		
	
		int idade,genero,fatorp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,p=1;
		Scanner leia=new Scanner(System.in);
		
		while(p<=5) {
			System.out.println("\nInforme a idade: ");
			idade = leia.nextInt();
			System.out.println("\nInforme o gênero: \n1-Feminino \n2Masculino \nOutros");
			genero = leia.nextInt();
			System.out.println("\nInforme o fator psicológico: \n1- Calma \n2-Nervosa \n3- Agressiva");
			fatorp = leia.nextInt();
			
			if(fatorp==1) {
				contpc++;
			}
			if(genero==1 && fatorp==2) {
				contmn++;
			}
			if(genero==2 && fatorp==3) {
				contha++;
			}
			if (genero==3 && fatorp==1) {
				contoc++;
			}
			if (fatorp==2 && idade>40) {
				contpn40++;
			}
			if(fatorp==1 && idade<18) {
				contpc18++;
			}
			p++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+contpc);
		System.out.println("\nNúmero de mulheres nervosas: "+contmn);
		System.out.println("\nNúmero de homens agressivos "+contha);
		System.out.println("\nNúmero de outros calmos: "+contoc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos "+contpn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contpc18);
		

	}

}
