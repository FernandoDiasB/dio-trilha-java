public class Ingresso {

    private double valor;
    private String nomeDoFilme;
    private String audio;

    public Ingresso(double valor, String nomeDoFilme, String audio){
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.audio = audio;
    }

    public double getValor(){
        return valor;
    }
    public String getNomeDoFilme(){
        return nomeDoFilme;
    }
    public String getAudio() {
        return audio;
    }

    public double getComprarIngresso(){
        return valor;
    }


}