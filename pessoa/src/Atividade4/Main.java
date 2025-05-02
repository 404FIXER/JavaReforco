package Atividade4;

public class Main {
    public static void main(String[] args) {
        //titular1
        ContaBancaria p1 = new ContaBancaria();
        p1.setTitularDaConta("Mateus");
        p1.setSaldoBancario(2000.00);
        p1.depositar(1200.00);
        p1.depositar(1200.00);
        p1.saque(3200.00);
        p1.saque(3200.00);
        //titular2
        ContaBancaria p2 = new ContaBancaria();
        p2.setTitularDaConta("Heitor");
        p2.setSaldoBancario(0);
        p2.saque(3000.0);

    }
}
