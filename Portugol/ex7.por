programa
{
	
	/* Um sistema de angústia lineares do tipo:
	ax + by = c & dx + ey = f, pode ser resolvido segundo: x = ce - bf sobre ae - bd & af - cd sobre ae - bd
	Escreva um sistema que lê os coordenadores a,b,c,d,eefe calcula e mostra os valores de x e y. */
	
	funcao inicio()
	{
		reais a,b,c,d,E,f,x,y

		escreva ( "Informe o coeficiente de A: " )
		leia (a)
		escreva ( "Informe o coeficiente de B: " )
		leia (b)
		escreva ( "Informe o coeficiente de C: " )
		leia (c)
		escreva ( "Informe o coeficiente de D: " )
		leia (d)
		escreva ( "Informe o coeficiente de E: " )
		leia (E)
		escreva ( "Informe o coeficiente de F: " )
		leia (f)

		x = (c * E)-(b * f)/(a * E)-(b * d)
          y = (a * f)-(c * d)/(a * E)-(b * d)

          escreva ( "valor de X: " ,mat.arredondar(x, 2 ), "\nvalor de Y: " ,mat.arredondar(y, 2 ))

	}
}
