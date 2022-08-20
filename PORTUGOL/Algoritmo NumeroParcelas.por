programa
{
/*EXERCÍCIO 10- A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. 
 * Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.
*/
	
	funcao inicio()
	{
		real valor, p1, p2, p3, p4, p5
		escreva("\nDigite o valor da compra: ")
		leia(valor)
		p1=valor /1
		p2=valor /2
		p3=valor/3
		p4=valor/4
		p5=valor /5
		escreva("\nO valor das parcelas em 1x é de: ", p1)
		escreva("\nO valor das parcelas em 2x é de: ", p2)
		escreva("\nO valor das parcelas em 3x é de: ", p3)
		escreva("\nO valor das parcelas em 4x é de: ", p4)
		escreva("\nO valor das parcelas em 5x é de: ", p5)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */