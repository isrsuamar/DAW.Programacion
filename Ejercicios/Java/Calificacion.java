	/**
	 * CALIFICACIÓN: Introducir una calificación de 0-10 y decir si es:
	 * 0 < 5 => INSUFICIENTE
	 * 5 => SUFICIENTE
	 * 6 => BIEN
	 * 7 - 8 => NOTABLE
	 * 9 - 10 => SOBRESALIENTE
	**/

import java.util.Scanner;

public class Calificacion 
{
    public static void main(String[] args) 
    {
        Scanner scannercito = new Scanner(System.in); 
        
        System.out.println("Dame la nota:");
        int nota = scannercito.nextInt();

        // if(nota < 5)
        // {
        //     System.out.println("Insuficiente");   
        // }
        // else if(nota == 5)
        // {
        //     System.out.println("Suficiente");
        // }
        // else if(nota == 6)
        // {
        //     System.out.println("Bien");
        // }
        // else if(nota == 7 || nota == 8)
        // {
        //     System.out.println("Notable");
        // }
        // else if(nota == 9 || nota == 10)
        // {
        //     System.out.println("Notable");
        // }
        // else
        // {
        //     System.out.println("No evaluable");
        // }

        switch (nota) 
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:

                System.out.println("Insuficiente");                
                break;

            case 5:

                System.out.println("Suficiente");                
                break;

            case 6:

                System.out.println("Bien");                
                break;

                
            case 7:
            case 8:
            
            System.out.println("Notable");                
            break;

            
            case 9:
            case 10:
            
                System.out.println("Sobresaliente");                
                break;
        
            default:
                System.out.println("No evaluable");                
                break;
        }

        scannercito.close();
    }
}
