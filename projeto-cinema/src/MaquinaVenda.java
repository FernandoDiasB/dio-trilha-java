import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MaquinaVenda {
    private final static double valorPadraoIngresso = 10;
    private final static double valorMeiaIngresso = valorPadraoIngresso/2;

    public static void finalizarVenda(){
        Scanner scanner = new Scanner(System.in);
        double quantidadeIngressos = 0;

        while (true) {
            try {
                System.out.println("Digite a quantidade de ingressos que deseja comprar: ");
                quantidadeIngressos = scanner.nextDouble();
                scanner.nextLine();
                if (quantidadeIngressos <= 0) {
                    System.out.println("Digite um valor maior que zero.");
                }else{
                    break;
                }
    
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, digite apenas numeros!");
                scanner.nextLine();
            }
        }
        
        
        List<String> ingressos = new ArrayList<>();
        double valorTotal = 0;
        
        for (int i = 1 ; i <= quantidadeIngressos; i++) {
            System.out.printf("Ingresso %d: (i) Inteira ou (m) Meia? ", i);
            String tipoIngresso = scanner.nextLine();

            if (tipoIngresso.equals("i")) {
                ingressos.add("Inteira");
                valorTotal += valorPadraoIngresso;
            } else if(tipoIngresso.equals("m")){
                ingressos.add("Meia");
                valorTotal += valorPadraoIngresso/2;
            }else{
                System.out.println("Digite i para Inteira ou m para Meia!!");
            }
        }

        System.out.println("================== Resumo do pedido ================");
        for(int i = 0; i < ingressos.size(); i++){
            System.out.printf("Ingrressos %d: %s - R$ %.2f\n", i + 1, ingressos.get(i), (ingressos.get(i).equals("Inteira") ? valorPadraoIngresso : valorMeiaIngresso));
        }
        System.out.printf("O valor Total da compra eh: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
