package Atividade6;

public class Circulo {
    private double raio;
    public Circulo (double raio) {
        if (raio>0) {
            this.raio = raio;
        }else {
            System.out.println("Raio invalido! Usando 1 como padrão! ");
            this.raio = 1;
        }

}
public double getArea (){
    return Math.PI * raio * raio; }
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }
}
