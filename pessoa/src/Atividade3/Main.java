package Atividade3;

public class Main {
    public static void main(String[] args) {


        Aluno p1 = new Aluno();
        p1.setNome("Kael");
        p1.setNota1(5.6);
        p1.setNota2(8.9);
        p1.calcularmedia();

        Aluno p2 = new Aluno();
        p2.setNome("Vitor");
        p2.setNota1(4.5);
        p2.setNota2(6.0);
        p2.calcularmedia();

        Aluno p3 = new Aluno();
        p3.setNome("Mateus");
        p3.setNota1(8.9);
        p3.setNota2(10.0);
        p3.calcularmedia();
    }
}
