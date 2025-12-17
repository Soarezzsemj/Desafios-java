import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Calcular area do retangulo");

        System.out.println("Digite o tamanho da base");
        double base = scanner.nextDouble();

        System.out.println("Digite o tamanho da altura");
        double altura = scanner.nextDouble();
        
        scanner.close();
        
        
        double area = base * altura;

        System.out.println("A area do seu triangulo é de " + area);



    }
}
