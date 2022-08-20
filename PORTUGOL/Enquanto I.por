programa
{
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
	
	funcao inicio()
	{
		real numero, somanum=0,medianum
		inteiro quantnum=0

		escreva("\nEntre com um número: ")
		leia(numero)

		enquanto(numero>0)
		{
			somanum+=numero
			quantnum++
			escreva("\nEntre com um número: ")
		leia(numero)
		}
		medianum= somanum / quantnum
		escreva("\nSomatório dos números lidos:", somanum)
		escreva("\nQuantidade de números lidos:", quantnum)
		escreva("\nMédia dos números lidos:", medianum)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */