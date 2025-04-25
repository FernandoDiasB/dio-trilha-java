public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(0, 0, 0);
        Conta poupanca = new ContaPoupanca(0, 0, 0);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
