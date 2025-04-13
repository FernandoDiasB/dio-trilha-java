import java.util.Scanner;

public class Iphone {
    
    static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=====Menu Pricipal====");
            System.out.println(" ");
            System.out.println("1 - Aparelho Telefônico");
            System.out.println("2 - Reprodutor de musicas");
            System.out.println("3 - Navegador");
            System.out.println("0 - Sair");
            System.out.println(" ");

            try {
                System.out.println("Selecione uma opção para prosseguir: ");
                opcao = scanner.nextInt();

                if (opcao >= 0 && opcao <= 3) {
                    new Iphone().executaOpcao(opcao);
                }else{
                    System.out.println("Digite um valor entre 0 e 3");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número entre 0 e 7.");
                scanner.nextLine();
            }
        }
    }

    private static void executaOpcao(int opcao){
        switch (opcao) {
            case 1:
                new AparelhoTelefonico().menuAparelhoTelefonico();
                break;
            case 2:
                new ReprodutorMusical().menuReprodutor();
                break;
            case 3:
                new NavegadorInternet().menuNavegador();
                break;
            case 0:
                System.out.println("Finalizando..");
                break;
        
            default:
            System.out.println("Opção inválida, tente novamente!");

                break;
        }
    }

}