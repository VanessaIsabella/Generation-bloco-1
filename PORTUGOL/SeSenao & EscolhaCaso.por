
/* CLIQUE NO SINAL DE "+", À ESQUERDA, PARA EXIBIR A DESCRIÇÃO DO EXEMPLO
 *  
 * Copyright (C) 2014 - UNIVALI - Universidade do Vale do Itajaí
 * 
 * Este arquivo de código fonte é livre para utilização, cópia e/ou modificação
 * desde que este cabeçalho, contendo os direitos autorais e a descrição do programa, 
 * seja mantido.
 * 
 * Se tiver dificuldade em compreender este exemplo, acesse as vídeoaulas do Portugol 
 * Studio para auxiliá-lo:
 * 
 * https://www.youtube.com/watch?v=K02TnB3IGnQ&list=PLb9yvNDCid3jQAEbNoPHtPR0SWwmRSM-t
 * 
 * Descrição:
 * 
 * 	Este exemplo utiliza a saída de dados do Portugol para exibir a 
 * 	mensagem "Olá mundo".
 * 
 * Autores:
 * 
 * 	Giordana Maria da Costa Valle
 * 	Carlos Alexandre Krueger
 * 	
 * Data: 01/06/2013
 */
 
programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio () 
	
	{
	cadeia nome = "Vanessa Oliveira"
	inteiro idade = 26,x=2,op
	real altura = 1.60,nota1,nota2,nota3,media
	

		escreva ("\n Nome da participante:",nome)
		escreva ("\n Idade da participante: ",idade," ano(s) de vida...")
		escreva ("\n Altura da participante:" ,altura, " metro(s)...")
		escreva ("\nEntre com a primeira nota:")
		leia (nota1)// já tenho o valor da nota 1
		escreva ("\nEntre com a segunda nota:")
		leia (nota2)
		escreva ("\nEntre com a terceira nota:")
		leia (nota3)
		media = (nota1+nota2+nota3) / 3
		escreva ("\nMédia aritmética da participante ",nome," foi de: ",mat.arredondar(media,2))
		nota1 = mat.raiz(nota2,3)
		nota2 = mat.potencia(nota3,4)
		x = idade % x // x = 1

		se(media>=7 e media<=10)
		{
			escreva("\nAluna aprovada!!!")
		}
		senao se(media>=5 e media<7)
	{
		escreva("\nAluna de exame!")
	}
	senao
	{
		escreva("\nAluna reprovada!")
	}
	escreva("\nMenu da sessão de elogios!")
	escreva("\n1 - Família da proatividade")
	escreva("\n2 - Família nota 10")
	escreva("\n3 - Família da criatividade")
	escreva("\n4 - Família que trabalha bem em equipe")
	escreva("\nDigite sua opção:")
	leia(op)
     escolha(op)
     {
     	caso 1: 
     escreva("\nFamília da proatividade")
     pare	
     caso 2: 
     escreva("\nFamília nota 10")
     pare
     caso 3: 
     escreva ("\nFamília da criatividade")
     pare
     caso 4:
     escreva("\nFamília que trabalha bem em equipe")
     pare
     caso contrario: 
     escreva("\nOpção inválida!")
     }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */