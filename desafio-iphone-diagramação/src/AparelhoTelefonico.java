import java.util.Scanner;

public class AparelhoTelefonico {

    static void menuAparelhoTelefonico() {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=====Menu Aparelho====");
            System.out.println(" ");
            System.out.println("1 - Teclado");
            System.out.println("2 - Ligar");
            System.out.println("3 - Atender");
            System.out.println("4 - Correio de Voz");
            System.out.println("5 - Contatos");
            System.out.println("6 - Recentes");
            System.out.println("7 - Favoritos");
            System.out.println("0 - Voltar ao menu anterior.");
            System.out.println("Escolha uma opção: ");
            System.out.println(" ");


            try {
                opcao = scanner.nextInt();

                if (opcao >= 0 && opcao <= 7) {
                    new AparelhoTelefonico().executaOpcao(opcao);
                }else{
                    System.out.println("Digite um valor entre 0 e 7");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número entre 0 e 7.");
                scanner.nextLine();
                
            }
        }
    }

    private void executaOpcao(int opcao) {
        switch (opcao) {
            case 1:
                mostrarTeclado();
                break;
            case 2:
                ligar();
                break;
            case 3:
                atender();
                break;
            case 4:
                iniciarCorreioDeVoz();
                break;
            case 5:
                contatos();
                break;
            case 6:
                recentes();
                break;
            case 7:
                favoritos();
                break;
            case 0:
            System.out.println("Criar opcao de voltar ao menu anterior");

                break;

            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }

    public static void mostrarTeclado() {
        System.out.println("\n Teclado.. \n");
    }

    public static void ligar() {
        System.out.println("Ligando para fulano..");
    }

    public static void atender() {
        System.out.println("Alô..");
    }

    public static void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz..");
    }

    public static void contatos() {
        System.out.println("Mostrando lista de contatos..");
    }

    public static void recentes() {
        System.out.println("Ligacoes recentes..");
    }

    public static void favoritos() {
        System.out.println("Lista de favoritos..");
    }
}
