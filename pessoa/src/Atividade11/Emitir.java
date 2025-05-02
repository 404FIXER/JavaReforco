package Atividade11;

public interface Emitir {
    default void emitirSom() {
        System.out.println(" Está fazendo algum som...");
    }
}
