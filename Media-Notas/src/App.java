import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("SISTEMA DE MEDIA DE NOTAS");

        System.out.println("DIGITE A PRIMEIRA NOTA");
        double nota1 = scanner.nextDouble();

        System.out.println("DIGITE A SEGUNDA NOTA");
        double nota2 = scanner.nextDouble();

        System.out.println("DIGITE A TERCEIRA NOTA");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3 ;


        if (media >= 7){
            System.out.println("APROVADO");
        } else{
            System.out.println("RECUPERAÇÃO");
        }



    }
}
