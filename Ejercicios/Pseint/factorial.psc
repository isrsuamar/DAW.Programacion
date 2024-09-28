// El factorial de un n�mero n,
// n! = n * (n-1) * (n-2) ...1
// 2! = 2 * 1 = 2
// 3! = 3 * 2 * 1 = 6
// 4! = 4 * 3 * 2 * 1 = 24
// 5! = 5 * 4 * 3 * 2 * 1 = 120
Algoritmo factorial
	
	Definir numeroFactorial Como Entero
	Definir resultado Como Entero

	Escribir "Dame un n�mero positivo"
	Leer numeroFactorial
	
	Si numeroFactorial < 0 Entonces
		Escribir "El factorial de un n�mero debe ser positivo"
	SiNo
		resultado = 1
		
		// OPCI�N 1
		Para n = 1 Hasta numeroFactorial Con Paso 1
			resultado = resultado * n
			//Escribir "El resultado parcial es: cuando n vale " n " el resultado es: " resultado 
		FinPara
		
		// OPCI�N 2
		Para n = numeroFactorial Hasta 1 Con Paso -1
			resultado = resultado * n
			//Escribir "El resultado parcial es: cuando n vale " n " el resultado es: " resultado 
		FinPara
		
		Escribir "El resultado es:" resultado
	FinSi	
FinAlgoritmo