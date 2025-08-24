public class projetoLivraria {
    public static void main(String[] args) {
        Livro obj1 = new  Livro();
        Livro obj2 = new Livro();
        Livro obj3 = new Livro();

        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;

        obj2.titulo = "O Senhor dos Anéis";
        obj2.numeroPaginas = 1216;
        obj2.anoPublicacao = 1954;
        obj2.preco = 59.90;

        System.out.println("Livro 1: " + obj1.titulo + " - R$" + obj1.preco);
        System.out.println("Livro 2: " + obj2.titulo + " - R$" + obj2.preco);

        obj1.cadastrar();
        double frete = obj1.calcFrete(" 66097-055");
        System.out.println( "Frete R$ " + frete);
    
        obj3.nome = "Arthur";
        obj3.cpf = "054.038.732-91";
        obj3.numcliente = 4187122;

        obj3.dadosP();
        obj3.comprar();
    }
}