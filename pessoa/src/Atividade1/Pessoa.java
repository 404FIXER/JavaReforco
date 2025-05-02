package Atividade1;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String novonome) {
        this.nome = novonome;
    }

    public void setIdade(int novaidade) {
        this.idade = novaidade;
    }

    void fazerAniversario() {
        // idade aumentada em 1 ano
        idade = idade + 1;
        System.out.println("Olá " + nome + " Você completou " + idade + " Anos hoje, Muitas felicidades para você Amigo!");
    }
}
