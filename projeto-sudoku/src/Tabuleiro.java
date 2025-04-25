public class Tabuleiro {
    private Celula[][] grid;

    public Tabuleiro() {
        grid = new Celula[9][9];
        // Inicializa com células vazias
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                grid[y][x] = new Celula(0, false);
            }
        }
    }

    public void adicionarCelula(int x, int y, int valor, boolean fixo) {
        grid[y][x] = new Celula(valor, fixo);
    }

    public void imprimirTabuleiro() {
        for (int y = 0; y < 9; y++) {
            if (y % 3 == 0) System.out.println("+-----------------------+");
            for (int x = 0; x < 9; x++) {
                if (x % 3 == 0) System.out.print("| ");
                System.out.print(grid[y][x] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-----------------------+");
    }
}
