import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("digite o numero da agencia");
        String nomeAgencia = scanner.next();

        System.out.println("nos informe seu nome");
        String nome = scanner.next();

        System.out.println("nos informe o saldo");
        double saldoAgencia = scanner.nextDouble();


        String menssagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldoAgencia + " já está disponível para saque" ;

        System.out.println(menssagem);
        scanner.close();


    }
}
