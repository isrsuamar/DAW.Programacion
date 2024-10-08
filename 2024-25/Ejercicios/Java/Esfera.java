import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Esfera 
{
    // P = 2 x PI x R
    // A = 4 x PI x RXR
    // V = 4/3 x PI x RXRXR
    public static void main(String[] args) 
    {
        // Dar el radio: Perímetro, área y  volumen
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el radio: ");
        double radio = sc.nextDouble();

        double perimetro = 2 * Math.PI * radio;
        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);

        System.out.printf("El perimetro es: %.2f m \n", perimetro);
        System.out.printf("El area es: %.2f m2 \n", area);
        System.out.printf("El volumen es: %.2f m3 \n", volumen);

        sc.close();
    }
}
