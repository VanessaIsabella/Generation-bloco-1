programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("\nDigite um número inteiro:")
		leia(num)

		se(num % 2 == 0)
		{
			escreva("\nO número é par")
		}
		senao
		escreva("\nO número é ímpar")

		se(num<0)
		{
			escreva(" e negativo")
		}

		se(num>0)
		escreva(" e positivo")
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */