package testeJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Vanessa Oliveira";
		int idade = 26, op;
		double altura = 1.60, nota1, nota2, nota3, media;
		
		//aqui começa a impressão das variáveis//
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\nVamos apresentar os dados de Vanessa:");
		System.out.println("\nNome da participante: " +nome);
		System.out.println("\nIdade da participante: " +idade+ " ano(s) de vida");
		System.out.println("\nAltura da participante: " +altura);
		
		System.out.println("\nEntre com a primeira nota: ");
	    nota1 = leia.nextDouble();
	    System.out.println("\nEntre com a segunda nota: ");
	    nota2 = leia.nextDouble();
	    System.out.println("\nEntre com a terceira nota: ");
	    nota3 = leia.nextDouble();
	    
		media=(nota1+nota2+nota3)/3;
		System.out.println("\nMédia Aritmética: "+media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAlune aprovade!!!");
		} else if(media>=5 && media<7){
			System.out.println("\nAlune de exame!!!");
		} else {
			System.out.println("\nAlune reprovade");
		}
		
		System.out.println("\nLista de filmes:");
		System.out.println("n1- As branquelas");
		System.out.println("n2- Shrek");
		System.out.println("\n3- Os vingadores");
		System.out.println("\n4- Diário de um adolescente");
		System.out.println("\n3- Digite sua opção");
		op = leia.nextInt();
				switch(op) {
				case 1:
					System.out.println("n1- As branquelas");
					break;
				case 2:
					System.out.println("n1- Shrek");
					break;
				case 3:
					System.out.println("n1- Os vingadores");
					break;
				case 4:
					System.out.println("n1- Diário de um adolescente");
					break;
					default:
						System.out.println("\nOpção inválida");
					
					
				}
				
				
		
		
		
	}

}
