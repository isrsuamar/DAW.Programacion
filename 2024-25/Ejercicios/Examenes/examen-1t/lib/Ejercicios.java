package lib;
import lib.Leer;
import lib.Datos;

public class Ejercicios 
{
	public static final String diccionario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Función que imprime los programas disponibles y devuelve la opción elegida
	 * @return opción elegida
	 */
	public static int menu() 
	{
		String mensaje = "Elige el programa a cargar\n" +
						"1. Calcular puntos de palabra\n" +
						"2. Encontrar regalo de 100 puntos\n" +
						"3. Encontrar el camello mas cargado";

		System.out.println(mensaje);

		int numero = Leer.entero();

		return numero;
	}

	/**
	 * Función que carga el programa elegido
	 * @param opcion
	 */
	public static void cargarPrograma(int opcion) 
	{
		switch (opcion) 
		{
			case 1:

				programaRegalo();
				break;

			case 2:
			
				programaRegalo(Datos.regalos);
				break;
		
			case 3:
		
				programaPaquete();
				break;
			
			default:
				break;
		}
	}

	/**
	 * Función que pide una palabra y calcula su valor hasta que se introduce una palabra con valor 100
	 */
	public static void programaRegalo() 
	{
		int valor = 0;

		do 
		{
			System.out.println("Introduce la palabra");
			String palabra = Leer.texto();

			valor = calcularRegalo(palabra);
			System.out.println("Valor: " + valor);
		} 
		while (valor != 100);
	}

	/**
	 * Función que calcula el valor de cada palabra y muestra las que tienen valor 100
	 * @param palabras array de palabras a calcular
	 */
	public static void programaRegalo(String[] palabras) 
	{
		for (String palabra : palabras) 
		{
			if(calcularRegalo(palabra) == 100)
			{
				System.out.println(palabra);
			}
		}
	}

	/**
	 * Función que calcula el valor de una palabra
	 * - Desde la A vale 1 punto hasta la Z vale 26 puntos
	 * @param palabra palabra a calcular el valor
	 * @return valor de la palabra
	 */
	public static int calcularRegalo(String palabra) 
	{
		// palabra = palabra.toUpperCase();

		// int suma = 0;

		// for (int i = 0; i < palabra.length(); i++) 
		// {
		// 	char caracter = palabra.charAt(i);

		// 	suma += diccionario.indexOf(caracter) + 1;
		// }

		// return suma;
		
		palabra = palabra.toUpperCase();

		if(palabra.isEmpty())
		{
			return 0;
		}

		char caracter = palabra.charAt(0);
		int valor = diccionario.indexOf(caracter) + 1;

		return valor + calcularRegalo(palabra.substring(1));
	}

	/**
	 * Función que muestra el camello con mas paquetes
	 */
	public static void programaPaquete() 
	{
		System.out.println(encontrarPaquete(Datos.paquetes));
	}

	/**
	 * Función que encuentra el camello con mas paquetes
	 * - Suma los paquetes de cada camello y devuelve el valor del camello con mas paquetes
	 * @param paquetes array de paquetes
	 * @return camello con mas paquetes
	 */
	public static int encontrarPaquete(int[][] paquetes) 
	{
		int maxValorCamello = 0;
		int camelloConMayorValorPaquetes = -1;

		for (int i = 0; i < paquetes.length; i++) 
		{
			int totalPaquetesCamello = 0;

			for (int j = 0; j < paquetes[i].length; j++) {
				totalPaquetesCamello += paquetes[i][j];
			}

			if (totalPaquetesCamello > maxValorCamello) {
				maxValorCamello = totalPaquetesCamello;
				camelloConMayorValorPaquetes = i;
			}
		}
		
		return camelloConMayorValorPaquetes;
	}
}
