import java.util.Scanner;

public class AdivinaContrasenia 
{
    public static void main(String[] args) 
    {
        String passwordGuardado = "supercalifragilisticoespialidoso";

        Scanner sc = new Scanner(System.in);
        String passwordUsuario = "";

        do
        {
            System.out.println("Dame una contraseña: ");
            passwordUsuario = sc.nextLine();

            if(!passwordGuardado.equals(passwordUsuario))
            {
                System.out.println("Contraseña incorrecta, intenta de nuevo");
            }
        }
        while (!passwordGuardado.equals(passwordUsuario));
        
        System.out.println("Contraseña correcta");

        sc.close();

        // VERSIÓN CON WHILE
        // while(!passwordGuardado.equals(passwordUsuario))
        // {
        //     System.out.println("Dame una contraseña: ");
        //     passwordUsuario = sc.nextLine();

        //     if(!passwordGuardado.equals(passwordUsuario))
        //     {
        //         System.out.println("Contraseña incorrecta, intenta de nuevo");
        //     }
        // }
    }
}
