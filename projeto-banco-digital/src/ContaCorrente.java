public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);

    }

    public void imprimirExtrato(){
        System.out.println("==============Conta Corrente==============\n");
        ImpressaoComum();
    }


}
