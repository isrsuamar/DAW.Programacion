Algoritmo esAñoBisieto
	
	Definir anyo Como Entero
	Escribir  "Dime un año"
	Leer anyo
	
	Si anyo % 4 = 0 Entonces
		Escribir "El año es bisiesto"
	SiNo
		Si anyo % 400 = 0 Y anyo % 100 <> 0 Entonces
			Escribir "El año es bisiesto"
		SiNo
			Escribir "El año NO es bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
