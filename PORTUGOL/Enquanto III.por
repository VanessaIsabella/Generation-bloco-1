programa
{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/

	funcao inicio()
	{
		real valor=0,soma=0,media
		inteiro totalvalores=0

		escreva("\nDigite um valor: ")
		leia(valor)
		
		enquanto(valor>=0){
			soma+=valor
			totalvalores++
			
          escreva("\nDigite um valor: ")
		leia(valor)
          }
		media = soma / totalvalores

		escreva("\nTotal do somatório: ", soma)
		escreva("\nMédia: ", media)
		escreva("\nTotal de valores lidos:", totalvalores)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 758; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */