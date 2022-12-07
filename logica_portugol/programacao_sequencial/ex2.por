programa{

	/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
	
	função  inicio (){
		
		inteiro diasvida ,mes,ano,dias
		escreva ( "Dias de vida: " )
		leia (dias vida)
		ano = (diasvida / 365 )
		mes = (diasvida% 365 / 31 )
		dias = (diasvida% 365 % 31 )
		escreva ( "anos: " +ano+ "\nmeses: " +mes+ "\ndias: " +dias)

	}
		 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 148; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */