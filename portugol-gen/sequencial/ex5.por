programa
{
	inclua  biblioteca Matematica --> mat
 
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
	Considere que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva ( "valor de A, numero positivo: " )
		leia (nota1)
		escreva ( "valor de B, numero positivo: " )
		leia (nota2)
		escreva ( "valor de C, numero positivo: " )
		leia (nota3)

		media = ((nota1 + nota2 + nota3)/ 3 )

		escreva ( "A média da nota é: " + mat.arredondar(media, 2 ))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */