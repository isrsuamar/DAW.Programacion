// PRUEBAS: 
// l1=3, l2=4, l3=5
// l1=5, l2=12, l3=13
Algoritmo trianguloRectangulo
	Definir  l1,l2,l3 Como Entero
	Definir cat1, cat2, hipotenusa Como Entero
	
	Escribir "Dame el 1º lado"
	Leer l1
	
	Escribir "Dame el 2º lado"
	Leer l2
	
	Escribir "Dame el 3º lado"
	Leer l3
	
	// Encontrar la hipotenusa
	Si l1 > l2 Y l1 > l3 Entonces
		hipotenusa = l1
		cat1 = l2
		cat2 = l3
	SiNo
		Si l2 > l1 y l2 > l3 Entonces
			hipotenusa = l2
			cat1 = l1
			cat2 = l3
		SiNo
			hipotenusa = l3
			cat1 = l1
			cat2 = l2
		FinSi
	FinSi
	
	Si hipotenusa^2 = cat1^2 + cat2^2 Entonces
		Escribir "Es un triángulo rectángulo"
	SiNo
		Escribir  "No es un triángulo rectángulo"
	FinSi
	
FinAlgoritmo
