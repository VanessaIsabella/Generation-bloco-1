programa
{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		inteiro numeros[3][3], somatotal=0.0, linha, coluna, colunaDiag

		para(linha=0;linha<3;linha++)
		{
		para(coluna=0;coluna<3;coluna++)
		{
			escreva("\nEntre com um número: ")
			leia(numeros[linha][coluna])
			somatotal+=numeros[linha][coluna]
	}

		}
}
			}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */