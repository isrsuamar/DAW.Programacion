import java.util.Scanner;

public class ConvertirDolarAEuro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los dólares: ");

        double dolares = sc.nextDouble();
        double dolarAEuro = 0.91;

        double euros = dolares * dolarAEuro;

        System.out.println("Euros recibidos: " + euros);

        sc.close();
    }
}
