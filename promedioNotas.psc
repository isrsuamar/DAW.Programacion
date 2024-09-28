//El programa permitirá ingresar las calificaciones de una cantidad indefinida de estudiantes, 
//y calculará tanto la calificación promedio de todo el grupo como cuántos estudiantes han aprobado y cuántos han suspendido. 
// El programa seguirá pidiendo calificaciones hasta que el usuario ingrese un valor negativo, 
// lo cual indicará que ya no hay más estudiantes.
Algoritmo sin_titulo
	
	Definir calificacion Como Entero
	Definir numeroAlumnos Como Entero
	Definir sumaCalificaciones Como Entero
	Definir numeroAprobados, numeroSuspensos Como Entero
	Definir promedio Como Real
	
	numeroAlumnos = 0
	sumaCalificaciones = 0
	numeroAprobados = 0
	numeroSuspensos = 0
	
	// 1º PROMEDIO DE LAS NOTAS
	Repetir
		Escribir "Introduce la calificación:"
		Leer calificacion
		
		Si calificacion >= 0 Entonces
			
			numeroAlumnos = numeroAlumnos + 1
			sumaCalificaciones = sumaCalificaciones + calificacion
			
			Si calificacion >= 5 Entonces
				numeroAprobados = numeroAprobados + 1
			SiNo
				numeroSuspensos = numeroSuspensos + 1
			FinSi
		FinSi
		
	Hasta Que calificacion < 0
	
	// 2º Cuantos estudiantes han aprobado y cuantos han suspendido
	Si numeroAlumnos > 0 Entonces
		promedio = sumaCalificaciones / numeroAlumnos
		
		Escribir "El promedio de las notas es:",promedio
		Escribir "Nº alumnos aprobados: ",numeroAprobados
		Escribir "Nº alumnos suspensos: ",numeroSuspensos
	FinSi
FinAlgoritmo
