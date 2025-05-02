package Atividade9;

import java.util.Scanner;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo (double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double getAreaTriangulo () {
        return largura * altura;
    }
    public double getPerimetroTriangulo(){
        return 2 * (largura + altura);
    }

    public void info(){
        System.out.println("Area do triangulo: " + getAreaTriangulo());
        System.out.println("Perimetro do triangulo: " + getPerimetroTriangulo());
    }
}
