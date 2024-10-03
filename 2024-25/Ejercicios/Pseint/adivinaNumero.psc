// Se le pide al usuario que adivine un n�mero en 10 intentos
Algoritmo adivinaNumero
	Definir numeroSuerte, numeroUsuario, numeroIntentos Como Entero
	numeroSuerte = azar(100) + 1
	numeroIntentos = 0
	
	Escribir "Adivine el n�mero entre el 1 y el 100:"
	Leer numeroUsuario
	
	Mientras numeroUsuario <> numeroSuerte Y numeroIntentos < 10 Hacer
		
		Si numeroSuerte > numeroUsuario Entonces
			Escribir "Muy bajo"
		SiNo
			Escribir "Muy alto"
		FinSi
		
		// Incrementar a 1 por cada iteraci�n
		numeroIntentos = numeroIntentos + 1
		Escribir "Llevo ",numeroIntentos," intentos"
		Leer numeroUsuario
	Fin Mientras
	
	Si numeroUsuario = numeroSuerte Entonces
		
		Escribir "Enhorabuena! has acertado el n�mero ", numeroUsuario
	SiNo
		Escribir "El n�mero era: ", numeroSuerte 
	FinSi
	
FinAlgoritmo
