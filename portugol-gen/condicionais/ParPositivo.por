programa
{
	/*
	 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
	número é par ou ímpar, e se é positivo ou negativo.
	 */
	 
	funcao inicio()
	{
		inteiro  num

	 escreva "Digite um número: ")
	 leia(num)

	 se(num % 2 == 0){
	 	
	 	escreva  ("O número é par")
	 	
	 	}senao{
		escrevaa ("Este número é impar")
		}
		
		se(num > 0){
			escreva  ("\n O número é positivo")
		}
		senao{
			escrevaa ("\n O número é negativoio")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */