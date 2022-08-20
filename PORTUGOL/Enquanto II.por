programa
{
	
	funcao inicio()
	{
		inteiro numero, somaPar=0,quantImpar=0

		escreva("\nEntre com um número: ")
		leia(numero)
		enquanto(numero!=0)
		{
			se(numero % 2 == 0)
			{
				somaPar += numero // somapar = somaPar + numero
			}
			senao
			{
				quantImpar ++ //quantImpar = quantImpar + 1
			}
			escreva("\nEntre com um número: ")
			leia(numero)			
		}
		escreva("\nSoma dos números pares: ", somaPar)
		escreva("\nQuantidade de números ímpares:" ,quantImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */