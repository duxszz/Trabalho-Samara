public class Conta {
    String numConta;
    String titular;
    double saldo;

    void depositar(double valor){
        saldo += valor;
        System.out.println("Depósitando R$ " + valor);
    }
    void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "bem sucedido");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }    
    void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

