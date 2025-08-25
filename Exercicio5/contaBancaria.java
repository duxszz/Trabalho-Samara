public class contaBancaria {
 public static void main(String[] args) {
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    
        conta1.numConta = "2704";
        conta1.titular = "Tarso";

        conta1.depositar(600);
        conta1.consultarSaldo();
        conta1.sacar(200);
        conta1.consultarSaldo();
        
        conta2.numConta = "0305";
        conta2.titular = "Williane";
        
        conta2.depositar(1200);
        conta2.consultarSaldo();
 }
}
