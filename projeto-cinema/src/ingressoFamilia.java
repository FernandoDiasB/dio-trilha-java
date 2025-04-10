public class ingressoFamilia extends Ingresso {
    private int quantidadePessoas;


    public ingressoFamilia(double valor, String nomeFilme, String audio, int quantidadePessoas) {
        super(valor, nomeFilme, audio);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getComprarIngresso() {
        double total = getValor() * quantidadePessoas;
        if (quantidadePessoas > 3) {
            total *= 0.95; //  desconto
        }
        return total;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}