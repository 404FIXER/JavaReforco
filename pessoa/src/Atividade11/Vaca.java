package Atividade11;

public class Vaca extends Mamifero{
    Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Muuuuuu!");
    }

}
