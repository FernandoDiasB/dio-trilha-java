import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();
        double transacaoUm = scanner.nextDouble();
        double transacaoDois = scanner.nextDouble();
        double transacaoTres = scanner.nextDouble();
        double saldoFinal = saldoInicial + transacaoUm + transacaoDois + transacaoTres;

        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();

    }
}