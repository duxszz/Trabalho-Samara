public class projeloAluno {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno();
        Aluno Aluno2 = new Aluno();
        Aluno Aluno3 = new Aluno();

        Aluno1.nome = "Tarso Ferreira";
        Aluno1.matricula = 4187122;
        Aluno1.notaAv1 = 4.0;
        Aluno1.notaAv2 = 10.0;
        
        Aluno1.dados();
        Aluno1.veriapv();
       
        Aluno2.nome = "Daniel Flexa";
        Aluno2.matricula = 4143947;
        Aluno2.notaAv1 = 3.5;
        Aluno2.notaAv2 = 6.0;
        
        Aluno2.dados();
        Aluno2.veriapv();
    
        Aluno3.nome = "Pedro César";
        Aluno3.matricula = 4180660;
        Aluno3.notaAv1 = 2.5;
        Aluno3.notaAv2 = 3.3;
        
        Aluno3.dados();
        Aluno3.veriapv();
    }
}
