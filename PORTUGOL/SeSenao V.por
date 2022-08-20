programa
{
	
	funcao inicio()
	{
		inteiro c,n,excesso
		real saltotal,salexc
		escreva("\nEntre com o seu código:")
		leia(c)
		escreva("\nEntre com o número de horas trabalhadas:")
		leia(n)

		se (n>50)
		{
			excesso=n-50 
			salexc=excesso*20
			saltotal=500+salexc
		}
		senao
		{
			excesso=0
			salexc=0
			saltotal=n*10
		}
		escreva("\nSalário total:", saltotal)
		escreva("\nSalário excedente:", salexc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */