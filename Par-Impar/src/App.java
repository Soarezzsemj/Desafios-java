import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("VERIFICADOR SE O NUMERO É PAR OU IMPAR");
        System.out.println("digite o numero");
        int numero = scanner.nextInt();

        
        if (numero % 2 == 0) {
            System.out.println("é par");
        }else{

            System.out.println("é impar");
        }
    }
}
