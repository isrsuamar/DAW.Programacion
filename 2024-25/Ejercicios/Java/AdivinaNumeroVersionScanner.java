import java.util.Scanner;
import java.util.Random;

public class AdivinaNumeroVersionScanner 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numeroUsuario = sc.nextInt();

        if(numeroUsuario <= 0)
        {
            System.out.println("Introduce un número válido");
        }

        int numeroIntentos= 0;

        Random random = new Random();
        int numeroMaquina = random.nextInt(100) + 1;

        while(numeroMaquina != numeroUsuario && numeroIntentos < 10)
        {
            if(numeroMaquina > numeroUsuario)
            {
                System.out.println("Muy bajo");
            }
            else
            {
                System.out.println("Muy alto");
            }

            numeroIntentos++; // numeroIntentos = numeroIntentos + 1;

            System.out.println("Llevas " + numeroIntentos + " intentos.");

            System.out.println("Introduzca otro numero");

            numeroUsuario = sc.nextInt();
        }

        // Comprobar si el usuario ha adivinado el número
        if (numeroUsuario == numeroMaquina) 
        {
            System.out.println("¡Enhorabuena! Has acertado el número " + numeroUsuario);
        } 
        else 
        {
            System.out.println("El número era: " + numeroMaquina);
        }

        sc.close();
    }    
}