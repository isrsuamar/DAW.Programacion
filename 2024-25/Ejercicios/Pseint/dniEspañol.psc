Algoritmo calcularLetraDNI
	
	Definir dni, resto Como Entero
	Definir letra Como Caracter
	
	Escribir "Introduzca un dni válido"
	Leer dni
	
	Si dni < 10000000 o dni > 99999999 Entonces
		Escribir "El DNI debe tener 8 dígitos"
	FinSi
	
	resto = dni % 23
	
	Segun resto Hacer
		0:
			letra = "T"
		1:
			letra = "R"
		2:
			letra = "W"
		3:
			letra = "A"
		4:
			letra = "G"
		5:
			letra = "M"
		6:
			letra = "Y"
		7:
			letra = "F"
		8:
			letra = "P"
		9:
			letra = "D"
		10:
			letra = "X"
		11:
			letra = "B"
		12:
			letra = "N"
		13:
			letra = "J"
		14:
			letra = "Z"
		15:
			letra = "S"
		16:
			letra = "Q"
		17:
			letra = "V"
		18:
			letra = "H"
		19:
			letra = "L"
		20:
			letra = "C"
		21:
			letra = "K"
		22:
			letra = "E"
	Fin Segun
	
	Escribir "El DNI completo es:",dni,"-", letra
FinAlgoritmo
