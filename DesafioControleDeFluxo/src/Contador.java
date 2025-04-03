import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroUm, numeroDois;
            while (true) {
                System.out.println("Digite o primeiro parametro");
                numeroUm = scanner.nextInt();
                System.out.println("Digite o segundo parametro");
                numeroDois = scanner.nextInt();

                try {
                    conta(numeroUm, numeroDois);
                    break;
                } catch (Exception e) {
                    System.out.println("O segundo valor precisa ser maior que o primeiro!");
                }
            }
        }
    }

    public static void conta(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException("Erro: o Segundo valor deve ser maior que o primeiro!");
        }
        int calculo = numeroDois - numeroUm;
        System.out.println("O valor obtido na subtracao eh: " + calculo);
        for (int i = 1; i <= calculo; i++) {
            System.out.println("Imprimindo numero " + i);
        }
    }

}
