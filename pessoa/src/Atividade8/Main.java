package Atividade8;

public class Main {
    public static void main(String[] args) {
        Animal[] bichos = {
                new Gato(),
                new Cachorro(),
                new Gato(),
                new Cachorro()
        };
        for (Animal a : bichos ) {
            a.emitirsom();
        }
    }
}
