Algoritmo piedraPapelTijeras
	
	Definir opcionUsuario, opcionOrdenador Como Entero
	Definir opcionPiedra, opcionPapel, opcionTijera Como Entero
	Definir seguirJugando Como Caracter
	
	opcionPiedra = 1
	opcionPapel = 2
	opcionTijera = 3
	
	Repetir
		// Opciones
		Escribir "Elige una opción:"
		Escribir "1. Piedra"
		Escribir "2. Papel"
		Escribir "3. Tijera"
		
		Leer opcionUsuario
		
		// Genera un número aleatorio entre 1 - 3
		opcionOrdenador = Azar(3) + 1 
		
		// Opción elegida por el usuario
		Si opcionUsuario = opcionPiedra Entonces
			Escribir "Usuario ha elegido: Piedra"
		SiNo
			Si opcionUsuario = opcionPapel Entonces
				Escribir "Usuario ha elegido: Papel"
			SiNo
				Escribir "Usuario ha elegido: Tijera"
			FinSi
		FinSi
		
		// Opción elegida por el ordenador
		Si opcionOrdenador = opcionPiedra Entonces
			Escribir "Ordenador ha elegido: Piedra"
		SiNo
			Si opcionOrdenador = opcionPapel Entonces
				Escribir "Ordenador ha elegido: Papel"
			SiNo
				Escribir "Ordenador ha elegido: Tijera"
			FinSi
		FinSi
		
		// Determinar el ganador
		Si opcionUsuario = opcionOrdenador Entonces
			Escribir "Es un empate"
		SiNo
			Si (opcionUsuario = opcionPiedra Y opcionOrdenador = opcionTijera) O (opcionUsuario = opcionPapel Y opcionOrdenador = opcionPiedra) O (opcionUsuario = opcionTijera Y opcionOrdenador = opcionPapel) Entonces
				Escribir "El usuario ha ganado"
			SiNo
				Escribir "La máquina ha ganado"
			FinSi
		FinSi
		
		Escribir "¿Quieres jugar de nuevo? (S/N)"
		Leer seguirJugando
		
	Hasta Que seguirJugando = "N" o seguirJugando = "n"

	Escribir  "Gracias por jugar, hasta otra"
FinAlgoritmo
