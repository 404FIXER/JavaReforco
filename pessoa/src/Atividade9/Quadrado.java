package Atividade9;

public class Quadrado {
    private double largura;
    public Quadrado (double largura) {
        this.largura = largura;
    }
    public double getAreaQuadrado () {
        return largura * largura;
    }
    public boolean info (){
        if (largura<0){
            System.out.println("Erro! valor menor que 0 não forma triangulo!");
            return false;
        }
        System.out.println(" A Area do quadrado é " + getAreaQuadrado());
        return true;
    }

}
