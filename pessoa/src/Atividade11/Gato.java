package Atividade11;

public class Gato extends Mamifero {

    Gato(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom () {
        System.out.println(getNome() + " Miauuuu! ");
    }
}
