public class Ingresso {

    private double valor;
    private String nomeDoFilme;
    private String traducao;

    public Ingresso(double valor, String nomeDoFilme, String traducao){
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.traducao = traducao;
    }

    public double getValor(){
        return valor;
    }
    public String getNomeDoFilme(){
        return nomeDoFilme;
    }
    public String getAudio() {
        return traducao;
    }
    public double getComprarIngressoInteira(){
        return valor;
    }

    public double getComprarIngressoMeia(){
        return getValor() / 2;
    }

    public double getComprarIngressoPlanoFamilia(){
        return getValor() * 0.95;
    }
}