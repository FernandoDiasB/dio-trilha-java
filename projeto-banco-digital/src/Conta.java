public abstract class Conta{
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    private int agencia;
    private int numero;
    private double saldo;

    

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public abstract void imprimirExtrato();

    protected void ImpressaoComum(){
        System.out.printf("Agencia: %d \n", getAgencia());
        System.out.printf("Numero da conta: %d \n", getNumero());
        System.out.printf("Saldo: %.2f \n", getSaldo());
    }


}

