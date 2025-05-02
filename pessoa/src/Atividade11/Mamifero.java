package Atividade11;

public abstract class Mamifero implements Emitir {
    private String nome;

    Mamifero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando...");
    }

}
