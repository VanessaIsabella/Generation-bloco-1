programa
{
	
	funcao inicio()
	{
		real media[3],n1,n2,n3,somamedia=0.0,mediageral
		inteiro aluno

		para(aluno=0;aluno<3;aluno++)
		{
		escreva("\nEntre com a primeira nota: ")
		leia(n1)
		escreva("\nEntre com a segunda nota: ")
		leia(n2)
		escreva("\nEntre com a terceira nota: ")
		leia(n3)
		media[aluno] = (n1+n2+n3) /3
		escreva("\nMédia Aritmérica ", media[aluno])
		somamedia += media[aluno]	
		}

		mediageral = somamedia /3
		escreva("\nMédia geral: ", mediageral)

		para(aluno=0;aluno<3;aluno++)
		{
			escreva("\nMédia do aluno ",aluno+1," foi de?" ,media[aluno])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 136; 
 * @PONTOS-DE-PARADA = 6, 7, 11, 12, 13, 14, 15, 16, 17, 18, 22, 23, 27;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */