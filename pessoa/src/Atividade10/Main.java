package Atividade10;

public class Main {
    public static void main(String[] args) {
        // Cria o relógio em 23:59:55
        Relogio relogio = new Relogio(23, 59, 55);

        // Avança 5 vezes e imprime após cada tic()
        for (int i = 0; i < 5; i++) {
            relogio.tic();
            System.out.println(relogio.exibir());
        }
    }
}
