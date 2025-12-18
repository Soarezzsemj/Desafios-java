import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite aqui seu numero");
        int numero1 = scanner.nextInt();


        for(int i = 1; i <= numero1 ; i++){
            int numeroContagem = i;

            System.out.println(numeroContagem);

        }
        scanner.close();
    }
}
