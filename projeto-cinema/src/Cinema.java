import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    public void mostrarCartaz() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> filmes = new ArrayList<>();

        filmes.add("Avengers");
        filmes.add("Toy Story 8");
        filmes.add("Velozes e furiosos desafio em Cristóvão Colombo");
        filmes.add("Meu nome não é Washington");
        filmes.add("Popcorn and ice cream seelers");

        System.out.println("Filmes em cartaz:");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }

        double precoPadraoIngresso = 10;
        int opcaoFilme;

        do{
            System.out.println("Digite o numero do filme que deseja assitir: ");
            opcaoFilme = scanner.nextInt();
        }while(opcaoFilme < 0 || opcaoFilme >= filmes.size());


        String filmeEscolhido = filmes.get(opcaoFilme); 

        System.out.println("O filme sera dublado ou legendado?: "); 
                                                                    
        String opcaoAudio = scanner.next(); 

        System.out.println("Quantidade de ingresso: ");
        int numeroIngressos = scanner.nextInt();

        System.out.println("Escolha o tipo de ingresso: ");
        System.out.println("1 - Inteira");
        System.out.println("2 - Meia");
        System.out.println("3 - Familia");
        int tipoIngresso = scanner.nextInt();

        Ingresso ingresso = null;

        switch (tipoIngresso) {
            case 1:
                ingresso = new Ingresso(precoPadraoIngresso, filmeEscolhido, opcaoAudio);
                System.out.printf("Você escolheu o filme " + filmes.get(opcaoFilme) + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
                        ingresso.getValor() * numeroIngressos);
                break;
            case 2:
                ingresso = new IngressoMeia(precoPadraoIngresso, filmeEscolhido, opcaoAudio);
                System.out.printf("Você escolheu o filme " + filmes.get(opcaoFilme) + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
                        ingresso.getComprarIngresso() * numeroIngressos);
                break;
            case 3:
                ingresso = new ingressoFamilia(precoPadraoIngresso, filmeEscolhido, opcaoAudio, numeroIngressos);
                System.out.printf("Você escolheu o filme " + filmes.get(opcaoFilme) + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
                        ingresso.getComprarIngresso());
                break;

            default:
                System.out.println(" ");
                System.out.println("Opção inválida, tente novamente!");
                System.out.println(" ");
                break;
        }

    }

}
