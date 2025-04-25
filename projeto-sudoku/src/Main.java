public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        for (String arg : args) {
            try {
                String[] partes = arg.split("[,;]");
                int x = Integer.parseInt(partes[0]);
                int y = Integer.parseInt(partes[1]);
                int valor = Integer.parseInt(partes[2]);
                boolean fixo = Boolean.parseBoolean(partes[3]);

                tabuleiro.adicionarCelula(x, y, valor, fixo);
            } catch (Exception e) {
                System.out.println("Erro ao processar argumento: " + arg);
            }
        }

        tabuleiro.imprimirTabuleiro();
    }
}
