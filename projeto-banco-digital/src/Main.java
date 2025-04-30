public class Main {
    public static void main(String[] args) {
        
        //  interacao gerente
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Baruk", "12345678900");
        Cliente cliente2 = new Cliente("Palmito", "12345678911");
        Cliente cliente3 = new Cliente("Panchito", "12345678922");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);

        banco.listarClientes();


        //interacao ciente
        Conta cc = new ContaCorrente(0, 0, 0);
        Conta poupanca = new ContaPoupanca(0, 0, 0);

        cc.depositar(-200);
        poupanca.depositar(50);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
