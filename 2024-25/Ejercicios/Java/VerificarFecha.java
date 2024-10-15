import java.util.Scanner;

public class VerificarFecha 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anyo;

        System.out.println("Dame el dia");
        dia = sc.nextInt();

        System.out.println("Dame el mes");
        mes = sc.nextInt();

        System.out.println("Dame el año");
        anyo = sc.nextInt();

        boolean validarDias = true;

        if (dia <= 0 || dia > 31 || anyo < 1900 || mes < 1 || mes > 12) {
            validarDias = false;
        }

        // Comprobación si la fecha es una fecha correcta
        if (validarDias) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    validarDias = dia >= 1 && dia <= 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:

                    validarDias = dia >= 1 && dia <= 30;
                    break;

                case 2:

                    boolean esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);

                    if (esBisiesto) {
                        validarDias = dia >= 1 && dia <= 29;
                    } else {
                        validarDias = dia >= 1 && dia <= 28;
                    }

                    // De forma ternaria:
                    // validarDias = dia >= 1 && dia <= (esBisiesto ? 29 : 28); 

                    break;

                default:

                    validarDias = false;
                    break;
            }
        }

        if (validarDias) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es una fecha válida");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " NO es una fecha válida");
        }

        sc.close();
    }
}
