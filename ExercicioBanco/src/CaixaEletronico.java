public class CaixaEletronico {

    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    public CaixaEletronico(double depositoInicial) {
        this.saldo = depositoInicial;
        this.limiteChequeEspecial = calculoChequeEspecial(depositoInicial);
        this.chequeEspecialUsado = 0;
    }

    private double calculoChequeEspecial(double depositoInicial){
        return depositoInicial <= 500 ? 50 : depositoInicial * 0.5;
    }

    public double getSaldo(){        
        return saldo;
    }

    public double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }

    public double getChequeEspecialUsado(){
        return chequeEspecialUsado;
    }

    public double getChequeEspecialDisponivel(){
        return limiteChequeEspecial - chequeEspecialUsado;
    }

    public boolean estaUsandoCheque(){
        return chequeEspecialUsado > 0;
    }

    public void consultarSaldo(){
        System.out.printf("O saldo da sua conta é: RS %.2f\n", saldo);
    }

    public void depositar(double valor){
        if (chequeEspecialUsado > 0 ) {
            double taxa = chequeEspecialUsado * 0.2;
            double dividaChequeEspecial = chequeEspecialUsado + taxa;

            if (valor >= dividaChequeEspecial) {
                valor -= dividaChequeEspecial;
                System.out.printf("O valor de R$ %.2f\n foi utilizado para quitar a divida com o cheque especial.", dividaChequeEspecial);
                
            }else{
                double pago = valor / 1.2;
                chequeEspecialUsado -= pago;
                System.out.printf("R$ %.2f\n foi usado para abater o cheque especial", valor);
                
            }
        }
        saldo += valor;
        System.out.printf("Seu novo saldo é R$ %.2f\n", saldo);
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
        }else{
            double saldoResto = valorSaque - saldo;
            if (saldoResto <= getChequeEspecialDisponivel()) {
                saldo = 0;
                chequeEspecialUsado += saldoResto;
                System.out.printf("Saque realizado utilizando o cheque especial no valor de: R$ %.2f\n ", saldoResto);
                
            } else {
                System.out.println("Operação não realizada por falta de saldo");
                return;
            }            
        }
        System.out.printf("Saque realizado com sucesso no valor de: R$ %.2f\n", valorSaque);
        System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);
    }

    public void pagarBoleto(double valorBoleto) {
        if (valorBoleto <= saldo) {
            saldo -= valorBoleto;
            System.out.printf("Boleto pago com sucesso no valor de: %.2f\n", valorBoleto);
            System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);   
        }else{
            double diferenca = valorBoleto - saldo;
            if (diferenca <= getChequeEspecialDisponivel()) {
                saldo = 0;
                chequeEspecialUsado += diferenca;
                System.out.println("Pagamento realizado utilizando cheque especial.");
            }else{
                System.out.println("Operação não realizada por falta de saldo");
            }
        }
    }

    public void consultarChequeEspecial(){
        System.out.printf("Cheque especial disponivel: %.2f\n", getChequeEspecialDisponivel());
        System.out.printf("Cheque especial usado: %.2f\n", chequeEspecialUsado);
    }





}
