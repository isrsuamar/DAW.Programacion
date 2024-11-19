import java.util.Arrays;
import java.util.Scanner;

public class RotarArrays 
{
    public static void main(String[] args) 
    {
        String[] array = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero de veces que quieres que rote a la izquierda");
        int rotaciones  = sc.nextInt();

        System.out.println(Arrays.toString(array));
        System.out.println();

        // Rotamos tantas veces como rotaciones haya introducido el usuario
        for (int i = 0; i < rotaciones; i++) 
        {
            String temporal = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = temporal;
        }

        System.out.println("Array despues de " + rotaciones + " rotaciones hacia la izquierda");

        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
