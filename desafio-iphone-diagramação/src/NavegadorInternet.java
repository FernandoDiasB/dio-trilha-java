import java.util.Scanner;

public class NavegadorInternet {

    public static void menuNavegador() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=====Menu Navegador====");
            System.out.println(" ");
            System.out.println("1 - Exibir pagina principal");
            System.out.println("2 - Nova guia");
            System.out.println("3 - Atualizar pagina");
            System.out.println("4 - Historico");
            System.out.println("0 - Voltar ao menu anterrior");
            System.out.println("Escolha uma opção: ");
            System.out.println(" ");


            try {
                opcao = scanner.nextInt();
    
                if (opcao >= 0 && opcao <= 4) {
                    new NavegadorInternet().executaOpcao(opcao);
                } else {
                    System.out.println("Digite um valor entre 0 e 4!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número entre 0 e 4.");
                scanner.nextLine();
            }
        }
    }

    void executaOpcao(int opcao) {
        switch (opcao) {
            case 1:
                exibirPagina();
                break;
            case 2:
                atualizarPagina();
                break;
            case 3:
                atualizarPagina();
                break;
            case 4:
                historico();
                break;
            case 0:
                System.out.println("Criar opcao de voltar ao menu anterior");

                break;

            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }

    static void exibirPagina() {
        System.out.println("\n Exibindo Pagina..");
    }

    static void AdicionarNovaPagina() {
        System.out.println("\n Abrindo nova pagina..");
    }

    static void atualizarPagina() {
        System.out.println("\n Atualizando pagina..");
    }

    static void historico() {
        System.out.println("\n Mostrando historico!!!");
    }

}
