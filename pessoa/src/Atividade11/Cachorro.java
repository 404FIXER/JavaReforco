package Atividade11;

public class Cachorro extends Mamifero{
    Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom (){
        System.out.println(getNome() + " Au! Au! ");
    }
}
