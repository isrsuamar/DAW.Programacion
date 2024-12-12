import java.util.Scanner;

public class EjemplosFunciones
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();

        int numeroVocales = contarVocales(nombre);

        System.out.println("Numero de vocales: " + numeroVocales);

        // int factorial = calcularFactorialRescursivo(5);
        // String palabraInvertida = invertirPalabra("HOLA"); // ALOH
        // int potencia = calcularPotencia(2, 3);

        // int fibonacci = calcularFibonacci(5);
        //     /*
        //          *
        //         ***
        //        *****
        //       *******
        //      ********* 
        //     */
        // String arbolNavidad = dibujarArbolNavidad(5);

        // System.out.println(arbolNavidad);


        // String[] items = {"Espada", "Escudo", "Poción", "Arco"};
        // int[] valores = {100, 220, 50, 1200};

        // String itemValioso = encontrarItemMasValioso(items, valores);
        // System.out.println("Item más valioso: " + itemValioso);


        // Scanner sc = new Scanner(System.in);

        // System.out.println("Dame el numero");
        // int numerito = sc.nextInt();

        // System.out.println("El factorial es: " + calcularFactorial(numerito));
        // if(esNumeroPar(numerito))
        // {
        //     System.out.println("El numero es par");
        // }
        // else
        // {
        //     System.out.println("El numero es impar");
        // }

        // int suma = operaciones(1, 5, 5);
        // int resta = operaciones(2, 5, 5);
        // int multiplicacion = operaciones(3, 5, 5);
        // int division = operaciones(4, 5, 5);

        // double imc = calcularIMC(79, 1.68);

        // System.out.println("El IMC es: " + imc);

        sc.close();
    }

    public static String encontrarItemMasValioso(String[] items, int[] valores)
    {
        int indice = 0;

        for (int i = 1; i < valores.length; i++) 
        {
            if(valores[i] > valores[indice])
            {
                indice = i;
            }    
        }

        return items[indice];
    }
    
    public static boolean esNumeroPar(int x)
    {
        boolean resultado = false;

        if (x % 2 == 0) 
        {
            resultado = true;
        }

        return resultado;
    }
    
    public static int operaciones(int opcion, int x, int y)
    {
        int resultado = 0;

        switch (opcion) {
            // SUMAR
            case 1:

                resultado = x + y;
                break;

            // RESTAR
            case 2:

                resultado = x - y;
                break;

            // MULTIPLICAR
            case 3:

                resultado = x * y;
                break;

            // DIVIDIR
            case 4:

                resultado = x / y;
                break;

            default:
                break;
        }

        return resultado;
    }
    
    public static double calcularIMC(double masa, double estatura)
    {
        return masa / (estatura * estatura);
    }

    public static double convertirDolarAEuro(double tipoCambio, double cantidad)
    {
        return tipoCambio * cantidad;
    }

    public static int calcularFactorial(int numero)
    {
        if (numero < 0) {
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static String dibujarArbolNavidad(int altura)
    {
        String arbolito = "";

        for (int i = 0; i < altura; i++) {
            // Espacios en blanco para alinear el arbol
            for (int j = 0; j < altura - i - 1; j++) {
                arbolito += " ";
            }

            // Caracter '*' para representar las ramas del árbol
            for (int k = 0; k < 2 * i + 1; k++) {
                arbolito += "*";
            }

            // Cambiar de línea después de cada fila
            arbolito += "\n";
        }

        for (int i = 0; i < altura - i; i++) {
            arbolito += " ";
        }

        arbolito += "|\n";

        return arbolito;
    }

    /*
     * 1º ITERACIÓN => calcularFibonacci(4) => calcularFibonacci(3) + calcularFibonacci(2)
     * 2º ITERACIÓN => calcularFibonacci(3) => calcularFibonacci(2) + calcularFibonacci(1)
     * 1º ITERACIÓN => calcularFibonacci(2) => calcularFibonacci(1) + calcularFibonacci(0)
     * 
     */
    public static int calcularFibonacci(int numero)
    {
        // CASO BASE
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            System.out.println(numero);

            return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
        }
    }

    /*
     *           Ejemplo
     * ***** calcularPotencia(2,3) **********
     * 1º iteración: calcularPotencia(2,3) => 2 * calcularPotencia(2,2) = 2 * 4 = 8
     * 2º iteración: calcularPotencia(2,2) => 2 * calcularPotencia(2,1) = 2 * 2 = 4
     * 3º iteración: calcularPotencia(2,1) => 2 * calcularPotencia(2,0) = 2 * 1 = 2
     * 4º iteración: calcularPotencia(2,0) => 1 (CASO BASE)
     */
    public static int calcularPotencia(int base, int exponente)
    {
        // // caso base
        // if(exponente == 0)
        // {
        //     return 1;
        // }
        // // Caso recursivo
        // else
        // {
        //     return base * calcularPotencia(base, exponente - 1);
        // }
        int resultado = 1;

        for (int i = exponente; i > 0; i--) {
            resultado = base * resultado;
        }

        return resultado;
    }

    /*
     * Palabra: HOLA
     * Palabra invertida: ALOH4
     * 1º Iteración => invertirPalabra("HOLA") => "A" + invertirPalabra("HOL") = "A" + "LOH" = "ALOH"
     * 2º Iteración => invertirPalabra("HOL") => "L" + invertirPalabra("HO") = "L" + "OH" = "LOH"
     * 3º Iteración => invertirPalabra("HO") => "O" + invertirPalabra("H") = "O" + "H"  ="OH"
     * 4º Iteración => invertirPalabra("H") => "H"
     */
    public static String invertirPalabra(String palabra)
    {
        // Caso base
        if (palabra.length() == 1) {
            return palabra;
        }
        // Caso recursivo
        else {
            // "A"
            char ultimoCaracter = palabra.charAt(palabra.length() - 1);

            return ultimoCaracter + invertirPalabra(palabra.substring(0, palabra.length() - 1));
        }

    }

    /*
     * 1º iTERACIÓN => calcularFactorialRescursivo(5) => n * calcularFactorialRescursivo(4)
     * 2º iTERACIÓN => calcularFactorialRescursivo(4) => n * calcularFactorialRescursivo(3)
     * 1º iTERACIÓN => calcularFactorialRescursivo(3) => n * calcularFactorialRescursivo(2)
     * 1º iTERACIÓN => calcularFactorialRescursivo(2) => n * calcularFactorialRescursivo(1)
     * 1º iTERACIÓN => calcularFactorialRescursivo(1) => 1
     */
    
    public static int calcularFactorialRescursivo(int n)
    {
        if (n == 1) {
            return 1;
        }

        return n * calcularFactorialRescursivo(n - 1);
    }

    /*
     * Cuenta las vocales de una palabra
     */
    public static int contarVocales(String palabra)
    {
        // Caso base
        if(palabra.isEmpty())
        {
            return 0;
        }

        palabra = palabra.toLowerCase();

        // Caso recursivo
        char caracter = palabra.charAt(0);

        int suma = 0;

        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
        {
            suma = 1;
        }

        // int suma = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') ? 1
        //         : 0;
        
        return suma + contarVocales(palabra.substring(1));
    }
}