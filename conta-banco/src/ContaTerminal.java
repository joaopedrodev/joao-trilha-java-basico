import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

         //imprimindo os dados obtidos pelo usuario
         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco  " + "sua agência é  " + agencia + "conta  " + numero + " e seu saldo " + saldo + " já esta disponível para saque ");
         
    }
}
