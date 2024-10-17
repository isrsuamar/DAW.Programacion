import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijera 
{
    public static void main(String[] args) 
    {
        // Constantes
        final int opcionPiedra = 1;
        final int opcionPapel = 2;
        final int opcionTijera = 3;


        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        String salida = "";

        // Contadores para acumular las victorias de cada uno
        int contadorVictoriasUsuario = 0;
        int contadorVictoriasMaquina = 0;

        while (!salida.toUpperCase().equals("N")) 
        {
            contadorVictoriasMaquina = 0;
            contadorVictoriasUsuario = 0;
            int rondas = 1;

            while (contadorVictoriasUsuario < 3 && contadorVictoriasMaquina < 3) 
            {
                System.out.println("********** RONDA " + rondas + " *******************");

                String mensaje = "Elige una opcion: \n" + 
                "1. Piedra\n" +
                "2. Papel\n" + 
                "3. Tijera\n";
       
               System.out.println(mensaje);
               
               int opcionUsuario = sc.nextInt();
               int opcionMaquina = rand.nextInt(3) + 1;
       
               // Opción usuario
               if(opcionUsuario == opcionPiedra)
               {
                   System.out.println("Usuario ha elegido: Piedra");
               }
               else if(opcionUsuario == opcionPapel)
               {
                   System.out.println("Usuario ha elegido: Papel");
               }
               else
               {
                   System.out.println("Usuario ha elegido: Tijera");
               }
       
               // Opción máquina
               if(opcionMaquina == opcionPiedra)
               {
                   System.out.println("Maquina ha elegido: Piedra");
               }
               else if(opcionMaquina == opcionPapel)
               {
                   System.out.println("Maquina ha elegido: Papel");
               }
               else
               {
                   System.out.println("Maquina ha elegido: Tijera");
               }
       
               // Determinar el ganador
               if(opcionUsuario == opcionMaquina)
               {
                   System.out.println("Es un empate");
               }
               // Las opciones que tiene el usuario para ganar
               else if( (opcionUsuario == opcionPiedra && opcionMaquina == opcionTijera)
                   || (opcionUsuario == opcionPapel && opcionMaquina == opcionPiedra)
                   || (opcionUsuario == opcionTijera && opcionMaquina == opcionPapel))
               {
                   System.out.println("El usuario ha ganado");
                   contadorVictoriasUsuario++;
               }
               else
               {
                   System.out.println("La maquina ha ganado");
                   contadorVictoriasMaquina++;
               }

               System.out.println("Usuario: " + contadorVictoriasUsuario + "\n" + "Maquina: " + contadorVictoriasMaquina);
               rondas++;
            }
          

           String mensajeSalida = "¿Quieres seguir jugando? (Y/N)";
           System.out.println(mensajeSalida);

           salida = sc.next();
        }

        sc.close();
    }    
}
