package Atividade6;

public class Main {
    public static void main(String[] args) {


        Circulo p1 = new Circulo(3);
        Circulo p2 = new Circulo(7.5);
        Circulo p3 = new Circulo(-2);
        imprimir(p1);
        imprimir(p2);
        imprimir(p3);

    }
    private static void imprimir (Circulo p) {
        System.out.println("__________________________________");
        System.out.println("Circulo de raio: " + p.getRaio());
        System.out.println("Área: " + p.getArea());
        System.out.println("Perimetro: " + p.getPerimetro());
        System.out.println("__________________________________");
    }
}
