import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("MAIOR DE DOIS, DIGITE 2 NUMERO E VOU MOSTRAR QUAL É MAIOR");
        System.out.println("Numero 1");
        double numero1 = scanner.nextDouble();

        System.out.println("Numero 2");
        double numero2 = scanner.nextDouble();


        if(numero1 > numero2){
            System.out.println("O primeiro numero é maior -> " + numero1);
        }else if (numero1 < numero2) {
            System.out.println("O segundo numero é maior -> " + numero2);
            
        }else if (numero1 == numero2) {
            System.out.println("Os dois numeros digitados sao iguais");
            
        }






    }
}
