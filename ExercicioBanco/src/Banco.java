import java.util.Scanner;

public class Banco {
    private CaixaEletronico conta;
    private Scanner scanner;

    public Banco(){
        this.scanner = new Scanner(System.in);
    }

    public void  iniciar(){
        System.out.println("Digite o valor do deposito inicial para inciar a aplicação: ");
        double depositoInicial = scanner.nextDouble();
        conta = new CaixaEletronico(depositoInicial);

        int opcao;
        do{
            menu();
            opcao = scanner.nextInt();
            executaOpcao(opcao);
        } while(opcao != 0);
    }

    public void menu(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Consultar saldo: ");
        System.out.println("2 - Depositar:");
        System.out.println("3 - Sacar: ");
        System.out.println("4 - Pagar boleto: ");
        System.out.println("5 - Verificar cheque especial");
        System.out.println("0 - sair: ");
    }

    private void executaOpcao(int opcao){
        
        switch (opcao) {
            case 1:
                conta.consultarSaldo();
                break;

            case 2:
            System.out.println("Digite o valor do depóito: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;

            case 3:
            System.out.println("Ddigite o valor para o saque: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;

            case 4:
            System.out.println("Digite o valor do boleto: ");
            break;

            case 5:
            //todo
            break;
            case 0:
            System.out.println("Encerrando...");
            System.out.println("O krikor tem muitos filhos... ♪♪♪");
            
            default:
            System.out.println("Opção inválida, tente novamente!");
        }
        
    }

}