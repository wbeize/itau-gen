programa
{

	/*Construa um programa em c que, tendo como dados de entrada dois pontos qualquer no plano,
	P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que processa tal cálculo é: */
	
	inclua  biblioteca Matematica --> mat
	
	
	funcao inicio()
	{
		real x1,y1,x2,y2,d,dr

          escreva ( "entre com o valor de x1: " )
          leia (x1)
           escreva ( "entre com o valor de y1: " )
          leia (y1)
           escreva ( "entre com o valor de x2: " )
          leia (x2)
           escreva ( "entre com o valor de y2: " )
          leia (y2)
          
          
		d = (mat.potencia(x2 - x1, 2 . 0 ))+(mat.potencia(y2 - y1, 2 . 0 ))
		dr = mat. raiz (d, 2 . 0 )

		escreva ( "a distância entre eles é: " ,mat.arredondar(dr, 2 ))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */