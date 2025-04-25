public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);

    }

    public void imprimirExtrato(){
        System.out.println("==============Conta Poupanca==============\n");
        
        ImpressaoComum();
    }



}
