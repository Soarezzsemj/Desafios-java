import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o primeiro numero");
        double numero1 = scanner.nextDouble();
    

        System.out.println("digite o segundo numero");
        double numero2 = scanner.nextDouble();

        scanner.close();

        double soma = numero1 + numero2;


        System.out.println("O resultado de " + numero1 + " + " + numero2 +" é igual a = " + soma);

    }
}
