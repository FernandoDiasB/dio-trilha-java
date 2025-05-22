import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] transacoes = new double[3];

        // Leitura das 3 transações
        for (int i = 0; i < 3; i++) {
            transacoes[i] = Double.parseDouble(scanner.nextLine());
        }

        // Leitura do valor mínimo (4ª entrada)
        double valorMinimo = Double.parseDouble(scanner.nextLine());

        // Contar quantas transações são maiores que o valor mínimo
        int contador = 0;
        for (double valor : transacoes) {
            if (valor > valorMinimo) {
                contador++;
            }
        }

        // Saída: total de transações maiores que o valor mínimo
        System.out.println(contador);

        scanner.close();
    }
}
