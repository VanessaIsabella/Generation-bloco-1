programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],somavalor=0,somadiagonal=0,linha,coluna

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com os valores da matriz: ")
				leia(matriz[linha][coluna])
				somavalor+=matriz[linha][coluna]

				se(linha==coluna)
				{
					somadiagonal+=matriz[linha][coluna]
				}
			}
		}
		escreva("\nSomatório dos valores da matriz: ", somavalor)
		escreva("\nSomatório da diagonal principal: " ,somadiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */