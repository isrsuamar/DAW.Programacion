import java.util.Scanner;

/**
 * Introducir un total de horas y te dice las semanas/días/horas equivalentes
 * 
 *  169 horas => 1 semana / 0 dias / 0 horas
 */
public class TotalHoras 
{
    public static void main(String[] args) 
    {
        // Constantes
        final int numeroHorasEnUnaSemana = 168;
        final int numeroHorasEnUnDia = 24;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame las horas");
        int totalHoras = sc.nextInt();

        // Cada semana tiene 168 horas
        int semanas = totalHoras / numeroHorasEnUnaSemana;
        
        int horasRestantes = totalHoras % numeroHorasEnUnaSemana;

        // Cada día tiene 24 horas
        int dias = horasRestantes / numeroHorasEnUnDia;

        // El resto son las horas
        int horas = horasRestantes % numeroHorasEnUnDia;

        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");

        sc.close();
    }
}
