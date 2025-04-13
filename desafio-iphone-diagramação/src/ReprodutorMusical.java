import java.util.Scanner;

public class ReprodutorMusical {

    public static void menuReprodutor(){
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
    
        while(opcao !=0){
            System.out.println("=====Menu Reprodutor====");
            System.out.println(" ");
            System.out.println("1 - Play");
            System.out.println("2 - Pause");
            System.out.println("3 - Lista de musicas");
            System.out.println("3 - Lista de artistas");
            System.out.println("0 - Voltar ao menu anterior.");
            System.out.println("Escolha uma opção: ");
            System.out.println(" ");

    
            try {
                opcao = scanner.nextInt();
    
                if (opcao >= 0 && opcao <= 4) {
                    new ReprodutorMusical().executarOpcao(opcao);
                }else{
                    System.out.println("Digite um valor entre 0 e 4!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número entre 0 e 4.");
                scanner.nextLine();
            }
        }
    }


    private void executarOpcao(int opcao){
        switch (opcao) {
            case 1:
                tocarMusica();
                break;
        
            case 2:
                pausarMusica();
                break;
        
            case 3:
                selecionarMusica();
                break;
            case 4:
                listaDeArtistas();
                break;
        
            case 0:
            System.out.println("Criar opcao de voltar ao menu anterior");

                break;

            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }
    
    public static void tocarMusica(){
        System.out.println("Reproduzindo faixa...");
    }
    public static void pausarMusica(){
        System.out.println("Pause...");
    }
    public static void selecionarMusica(){
        System.out.println("Exibindo Lista de musicas...");
    }
    public static void listaDeArtistas(){
        System.out.println("Exibindo lista de artistas...");
    }
}
