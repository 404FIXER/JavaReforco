package Atividade3;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularmedia (){
        double calcularmedia = (nota1 + nota2) / 2 ;
        System.out.println("------------------------");
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + calcularmedia);
        System.out.println("------------------------");
    }
}
