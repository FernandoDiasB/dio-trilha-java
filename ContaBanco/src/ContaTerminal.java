import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;
        int conta = 0;
        String agencia = "";

        System.out.println("Digite o numero da sua conta: ");
        conta = scanner.nextInt();
        System.out.println("Digite o numero da sua agencia: ");
        agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

}
