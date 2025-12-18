import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o numero da tabuada aqui");
        int numero = scanner.nextInt();

        for(int i = 0; i < 11; i++){
           
            int soma = numero * i;

            System.out.println(soma);
        }

    }
}
