Algoritmo esA�oBisieto
	
	Definir anyo Como Entero
	Escribir  "Dime un a�o"
	Leer anyo
	
	Si anyo % 4 = 0 Entonces
		Escribir "El a�o es bisiesto"
	SiNo
		Si anyo % 400 = 0 Y anyo % 100 <> 0 Entonces
			Escribir "El a�o es bisiesto"
		SiNo
			Escribir "El a�o NO es bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
