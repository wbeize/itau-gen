programa
{

inclua  biblioteca Matematica --> mat

	/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: */
	
	funcao  inicio (){
		
		reais A,B,C,R,S,D

		escreva ( "valor de A, numero positivo: " )
		leia (A)
		escreva ( "valor de B, numero positivo: " )
		leia (B)
		escreva ( "valor de C, numero positivo: " )
		leia (C)

		R = (mat.potencia(A + B, 2 . 0 ))
		S = (mat.potencia(B + C, 2 . 0 ))
          D = (R + S)/ 2

          escreva ( "Valor de R é: " +R+ "\nValor de S é: " +S+ "\nValor de D é: " +D)
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 19; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */