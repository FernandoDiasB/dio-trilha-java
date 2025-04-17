import java.util.ArrayList;
import java.util.Scanner;

public class TotenCinema {

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
            System.out.println((i + 1) + "-" + filmes.get(i));
        }

        int opcaoFilme;

        do {
            System.out.println("Digite o numero do filme que deseja assitir: ");
            opcaoFilme = scanner.nextInt();
            if (opcaoFilme < 1 || opcaoFilme >= filmes.size()) {
                System.out.println("Digite um valor dentro do intervalo");
            }
        } while (opcaoFilme < 1 || opcaoFilme >= filmes.size() + 1);
        String escolhaDoFilme = filmes.get(opcaoFilme -1);


        String opcaoTraducao;
        do {
            System.out.println("O filme sera dublado ou legendado?: ");
            opcaoTraducao = scanner.next();
            if (!opcaoTraducao.equals("dublado") && !opcaoTraducao.equals("legendado")) {
                System.out.println("Opção inválida, digite dublado ou legendado");
            }
        } while (!opcaoTraducao.equals("dublado") && !opcaoTraducao.equals("legendado"));

        MaquinaVenda maquinaVenda = new MaquinaVenda();
        MaquinaVenda.finalizarVenda();

        System.out.printf("Você escolheu o filme " + filmes.get(opcaoFilme) + " " + opcaoTraducao);
        scanner.nextLine();
        scanner.close();
    }
}
