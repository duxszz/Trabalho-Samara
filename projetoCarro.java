public class projetoCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Toyota";
        c1.modelo = "Supra";
        c1.ano = 2024;
        
        c1.info();
        c1.ligar();

        c2.marca = "Honda";
        c2.modelo = "Civic Type-R";
        c2.ano = 2022;

        
        c2.info();
        c2.ligar();
    }   
}