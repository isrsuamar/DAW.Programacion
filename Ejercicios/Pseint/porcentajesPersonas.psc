Algoritmo calcularPorcentajesPersonas
	
	Definir numeroHombres, numeroMujeres, numTotalPersonas Como Entero
	Definir porcentajeHombre, porcentajeMujer Como Real
	
	Escribir "Dime el n� de hombres"
	Leer numeroHombres
	
	Escribir "Dime el n� de mujeres"
	Leer numeroMujeres
	
	// Total de personas
	numTotalPersonas = numeroHombres + numeroMujeres
	
	// Calculo de los porcentajes
	porcentajeHombre = (numeroHombres * 100) / numTotalPersonas;
	porcentajeMujer = (numeroMujeres * 100) / numTotalPersonas;
	
	Escribir "Hombres: " porcentajeHombre " %, Mujeres: " porcentajeMujer " %" 
	
FinAlgoritmo
