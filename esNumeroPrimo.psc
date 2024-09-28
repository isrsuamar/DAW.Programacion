Algoritmo esNumeroPrimo
	
	Definir numerito Como Entero
	Definir esPrimo Como Logico // 0 o 1
	esPrimo = Verdadero
	
	Escribir "Dame el número (tiene que ser mayor que 1):"
	Leer numerito
	
	Si numerito <= 1 Entonces
		Escribir  numerito, " no es un número válido. Debe ser mayor que 1"
	SiNo
		
		Para divisor = 2 Hasta numerito - 1 Con Paso 1 Hacer
			
			Si numerito % divisor = 0 Entonces
				esPrimo = falso
			FinSi
		FinPara
		
		Si esPrimo = Verdadero Entonces
			Escribir numerito, " es un número primo"
		SiNo
			Escribir numerito, " NO es un número primo"
		FinSi
	FinSi
FinAlgoritmo
