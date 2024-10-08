import java.util.Scanner;

public class IMC 
{
    public static void main(String[] args) 
    {
        double peso, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el peso: ");
        peso = sc.nextDouble();
        
        System.out.println("Dime la altura: ");
        altura = sc.nextDouble();

        int IMC = (int) (peso / Math.pow(altura, 2));

        String mensaje = "Tu IMC midiendo " + altura + " metros y pesando "
                + peso + " kg es de " + IMC;

        System.out.println(mensaje);

        sc.close();
    }
}
