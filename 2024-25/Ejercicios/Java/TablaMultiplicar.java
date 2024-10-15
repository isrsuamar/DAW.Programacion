import java.util.Scanner;

public class TablaMultiplicar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numerito: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            int multiplicacion = numero * i;
            String cadena = numero + " x " + i + " = ";

            System.out.println(cadena + multiplicacion);
        }

        sc.close();
    }
}
