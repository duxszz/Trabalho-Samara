public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void dados(){ 
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Av1: " + notaAv1);
    System.out.println("Av2: " + notaAv2);
    }
    double calcMedia(){
    return (notaAv1 + notaAv2) / 2;
    }
    void veriapv(){
        double media = calcMedia();
            if (media >=7) {
                System.out.println("Aprovado");
            } 
            else if (media >=4 && media <7) {
                System.out.println("Prova Final");
            }
            else {
                System.out.println("Reprovado");
            }
    }
}