//El programa permitir� ingresar las calificaciones de una cantidad indefinida de estudiantes, 
//y calcular� tanto la calificaci�n promedio de todo el grupo como cu�ntos estudiantes han aprobado y cu�ntos han suspendido. 
// El programa seguir� pidiendo calificaciones hasta que el usuario ingrese un valor negativo, 
// lo cual indicar� que ya no hay m�s estudiantes.
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
	
	// 1� PROMEDIO DE LAS NOTAS
	Repetir
		Escribir "Introduce la calificaci�n:"
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
	
	// 2� Cuantos estudiantes han aprobado y cuantos han suspendido
	Si numeroAlumnos > 0 Entonces
		promedio = sumaCalificaciones / numeroAlumnos
		
		Escribir "El promedio de las notas es:",promedio
		Escribir "N� alumnos aprobados: ",numeroAprobados
		Escribir "N� alumnos suspensos: ",numeroSuspensos
	FinSi
FinAlgoritmo
