programa
{
	/* 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos */

	funcao inicio()
	{
		inteiro a
		escreva ("\nDigite sua idade:")
	leia(a)
	se (a>=5 e a <=7)
	{
		escreva ("\nVocê está no grupo Infantil A")
	}
     se (a>=8 e a <=11){
     	escreva ("\nVocê está no grupo Infantil B")
     }
     se (a>=12 e a <=13){
     	escreva ("\nVocê está no grupo Juvenil A")
     }
     se (a>=14 e a <=17){
     	escreva ("\nVocê está no Juvenil B")
     }
     se (a>=18){
     	escreva("\nVocê está no grupo de Adultos")
     }
	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */