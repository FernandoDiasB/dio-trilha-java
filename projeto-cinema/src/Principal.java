import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                     // não entendi porque tá sublinhado o scanner

        String[] filmes = {
                "Avengers 14",
                "Toy Story 8",
                "Velozes e furiosos desafio em Cristóvão Colombo",      // Esse trecho fiz baseado em exercicios que tenho anotado
                "Meu nome não é Washington",                             // fiz meio no automático, preciso me aprofundar
                "Popcorn and ice cream seelers"
        };

        double precoPadraoIngresso = 10;

        System.out.println("Filmes em cartaz:");
        for (int i = 0; i < filmes.length; i++) {                                  // mesma anotação alí de cima ^
            System.out.println((i + 1) + " - " + filmes[i]);
        }

        System.out.println("Digite o numero do filme que deseja assitir: ");
        int opcaoFilme = scanner.nextInt();
        String filmeEscolhido = filmes[opcaoFilme - 1];               // isso aqui também não tá funcionando. 

        System.out.println("O filme sera dublado ou legendado?: "); // Não consegui pensar em uma maneira de limitar apenas entre dublado e legendado
        String opcaoAudio = scanner.next();                           // Pelo menos não se não for com opção numérica usando if else..

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
                System.out.printf(
                        "Você escolheu o filme " + filmes[opcaoFilme] + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
                        ingresso.getValor() * numeroIngressos);
                break;
            case 2:
                ingresso = new IngressoMeia(precoPadraoIngresso, filmeEscolhido, opcaoAudio);
                System.out.printf(
                        "Você escolheu o filme " + filmes[opcaoFilme] + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
                        ingresso.getComprarIngresso() * numeroIngressos);
                break;
            case 3:
                ingresso = new ingressoFamilia(precoPadraoIngresso, filmeEscolhido, opcaoAudio, numeroIngressos);
                System.out.printf(
                        "Você escolheu o filme " + filmes[opcaoFilme] + ", " + opcaoAudio + ", valor total: R$ %.2f\n",
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
