programa {

	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
	mostre-o expresso em horas, minutos e segundos. */
	
	funcao  inicio (){
		
		evento inteiroSegundo ,horas,minutosH,segundos,minutos
		escreva ( "duração de um evento em segundos: " )
		leia (eventoSegundo)
		horas = (eventoSegundo / 60 / 60 )
		minutos = (eventoSegundo / 60 % 60 )
		segundos = (eventoSegundo% 60 )
		
		escreva (horas+ " horas:" +minutos+ " minutos:" +segundos+ " segundos:" )

	}
		 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */