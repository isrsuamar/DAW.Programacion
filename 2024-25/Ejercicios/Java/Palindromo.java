import java.util.Scanner;

public class Palindromo 
{
    /*
     * ANA
     * OSO
     * anita lava la tina
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la palabra");

        String palabra = sc.nextLine();

        boolean esPalindromo = true;
        int longitudPalabra = palabra.length();

        for(int indice = 0; indice < longitudPalabra/ 2; indice++)
        {
            if (palabra.charAt(indice) != palabra.charAt(longitudPalabra - indice - 1)) 
            {
                esPalindromo = false;
                break;
            }
        }
        
        if(esPalindromo)
        {
            System.out.println(("La palabra " + palabra + " es un palindromo"));
        }
        else
        {
            System.out.println(("La palabra " + palabra + " no es un palindromo"));
        }

        sc.close();
    }    
}