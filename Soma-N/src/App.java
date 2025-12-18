import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite aqui seu numero");
        int n = scanner.nextInt();
        int somaFatorial = 0;

        for(int i = 1; i <= n ; i++){
            somaFatorial += i;
            
            System.out.println(somaFatorial);
        }
    }
}
