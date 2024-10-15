import java.util.*;

public class Bucle1 
{
    public static void main(String[] args) 
    {
        // for (int i = 0; i < 10; i++)
        // {
        //     System.out.println("Iteración: " + i + "/10");
        // }
        // i = 0 => suma = 0
        // i = 1 => suma =  0 + 1
        // i = 2 => suma = 1 + 2
        // i = 3 => suma = 3 + 3
        // i = 4 => suma = 6 + 4

        // int suma = 0;

        // for (int i = 1; i <= 100; i++) 
        // {
        //     suma += i;
        // }

        // System.out.println("La suma es: " + suma);

        // for (int i = 0; i <= 100; i = i + 2) 
        // {
        //     System.out.println(i);
        // }
        Random rand = new Random();
        int numero;
        int intentos = 0;

        do 
        {
            numero = rand.nextInt(100) + 1;

            System.out.println("Numero generado es: " + numero);

            intentos++;

        } while (numero % 5 != 0);

        System.out.println("El numero multiplo de 5 ha sido " + numero + " despues de " + intentos + " intentos.");
    }
}
