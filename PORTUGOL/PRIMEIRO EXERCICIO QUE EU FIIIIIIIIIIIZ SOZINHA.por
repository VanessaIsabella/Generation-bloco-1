programa
{
	
	funcao inicio()
	{
		inteiro num1,num2,soma
		escreva("\nDigite um número: ")
		leia(num1)
		escreva("\nDigite outro número: ")
		leia(num2)
		soma = num1+num2
          escreva("\nO resultado dos dois números é: ", soma)
		se(soma>100)
		{
			escreva("\nESSE NÚMERO É MAIOR QUE 100!")
		} 
		enquanto (soma<100)
		{
			escreva("\nESSE NÚMERO É MENOR QUE 100!")
			pare
		}
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */