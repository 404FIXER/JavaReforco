package Atividade4;

public class ContaBancaria {
    private String titularDaConta;
    private double saldoBancario ;

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }
    public void depositar (double depositoBancario) {
        saldoBancario += depositoBancario;
        System.out.println("___________________________________________");
        System.out.println(titularDaConta);
        System.out.println("Você fez um deposito de " + depositoBancario + " Reais ");
        System.out.println("Saldo atual: " + saldoBancario);
        System.out.println("___________________________________________");
    }
    public boolean saque (double saqueBancario) {

        if (saqueBancario>saldoBancario) {
            System.out.println("___________________________________________");
            System.out.println(titularDaConta);
            System.out.println("Tentativa de saque de " + saqueBancario);
            System.out.println("Erro! Você não pode sacar mais do que " + saldoBancario + " Reais ");
            System.out.println("___________________________________________");
            return false;
        }
        if (saqueBancario>saldoBancario && saldoBancario==0) {
            System.out.println("___________________________________________");
            System.out.println(titularDaConta);
            System.out.println("Tentativa de saque de " + saqueBancario);
            System.out.println("Erro! Você não possui Fundos Bancarios! ");
            System.out.println("___________________________________________");
            return false;
        }
        saldoBancario -= saqueBancario;
        System.out.println("___________________________________________");
        System.out.println(titularDaConta);
        System.out.println("Você fez um saque de " + saqueBancario + " Reais ");
        System.out.println("Saldo atual: " + saldoBancario);
        System.out.println("___________________________________________");
        return true;
    }
}
