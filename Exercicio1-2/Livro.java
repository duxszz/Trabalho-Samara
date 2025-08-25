public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;
    double valorfrete;

    void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }
    double calcFrete(String cep){
        System.out.println("calculando frete para o CEP" + cep);
        return valorfrete;
    }
    void vender(){
        System.out.println("Vendendo livro por R$ %.2f" + preco);
    }
    String trocar(){
        return "Livro trocado!";
    }

    // atv2 //
    String nome; 
    String cpf;
    int numcliente;
    
    void dadosP() {
        System.out.println("Ola, " + nome + " seus dados foram salvos");
    }

    void comprar() {
        System.out.println("cliente, " + numcliente + ", fez uma compra");
    }
}