public class IngressoMeia extends Ingresso{
    public IngressoMeia(double valor, String nomeDoFilme, String audio){
        super(valor, nomeDoFilme, audio);
    }

    @Override
    public double getComprarIngresso(){
        return getValor() / 2;
    }
}
