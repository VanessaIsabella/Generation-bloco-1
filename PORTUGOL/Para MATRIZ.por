programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][2], somanumeros=0,linha,coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<2;coluna++)
			{
				escreva("\nEntre com um número:" )
				leia(numeros[linha][coluna])
				somanumeros +=numeros[linha][coluna]
			}
		}
		escreva("\nSomatório dos números foi de: ", somanumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */