programa
{
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro vetor[2], soma=0.0, maiorvalor=0, maior=0,x,contmaior=0
		real medialanc
		
		para(x=0;x<2;x++)
		{
			escreva("\nEntre com o número do dado: ")
			leia(vetor[x])
			soma+=vetor[x]

			se(vetor[x]==6)
			{
				maiorvalor++
			}
			se(maior<vetor[x])
			{
				maior = vetor[x]
			}
			
		}
		para (x=0;x<2;x++)
		{
			se(maior==vetor[x])
			{
				contmaior++
			}
		}
		medialanc = soma /2
		escreva("\nMédia dos lançamentos:" , medialanc)
		escreva("\nVezes que apareceu o maior sendo o 6: ", maiorvalor)
		escreva("\nVezes que apareceu o maior: ", contmaior)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 888; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */