programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

	funcao inicio()
	{
		real pontos[5], maiorPont=0.0
		inteiro x
		para(x=0;x<5;x++){
			escreva("\nEntre com o número : ")
			leia(pontos[x])
			escreva("\nA pontuação do aluno foi: ", pontos[x],"\n")

			se(pontos[x]>maiorPont){
				maiorPont=pontos[x]
			}
		}
		escreva("\nA maior pontuação foi de :", maiorPont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 8, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */