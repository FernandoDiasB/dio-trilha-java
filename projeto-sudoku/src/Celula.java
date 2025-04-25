
public class Celula {
    int valor;
    boolean fixo;

    public Celula(int valor, boolean fixo) {
        this.valor = valor;
        this.fixo = fixo;
    }

    public String toString() {
        return fixo ? "[" + valor + "]" : " " + valor + " ";
    }
}
