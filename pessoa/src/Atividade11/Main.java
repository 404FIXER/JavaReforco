package Atividade11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Mamifero> fazenda = new ArrayList<>();
        fazenda.add(new Vaca("Mimosa"));
        fazenda.add(new Vaca("Estrela"));
        fazenda.add(new Cachorro("Lupino"));
        fazenda.add(new Cachorro("Mel"));
        fazenda.add(new Gato("Cant"));
        fazenda.add(new Gato("Heots"));
        for (Mamifero e : fazenda) {

            e.amamentar();
            e.emitirSom();


        }


    }

}
