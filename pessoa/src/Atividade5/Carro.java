package Atividade5;

import java.util.Scanner;

public class Carro {
    private String modelo;
    private double tanque;//litros
    private double kmporlitro;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }


    public boolean dirigir (double kmporlitro) {

        if (kmporlitro > tanque) {
            System.out.println("________________________________________");
            double TGastoKm = kmporlitro - tanque;
            System.out.println("Modelo do Carro: " + modelo);
            System.out.println("Tanque: " + tanque + " litro(s)");
            System.out.println("litros exigidos na viajem: " + kmporlitro);
            System.out.println();
            System.out.println("Você possui pouca Gasolina!");
            System.out.println();
            System.out.println("Faltam " + TGastoKm + " Litros para você Concluir a Viajem!");
            System.out.println("________________________________________");
            return false;
        }
        double TGastoKm = kmporlitro - tanque;
        System.out.println("________________________________________");
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Tanque: " + tanque + " litro(s)");
        System.out.println("litros exigidos na viajem: " + kmporlitro);
        System.out.println();
        System.out.println("A viajem foi um sucesso!");
        System.out.println();
        System.out.println("gasolina restante(s): " + TGastoKm + " Litro(s)");
        System.out.println("________________________________________");
        return true;
    }
        public void abastecimento (double litrosgasolina) {
            System.out.println("________________________________________");
            System.out.println("Modelo do Carro: " + modelo);
            System.out.println("Tanque: " + tanque + " litro(s)");
            System.out.println("litros exigidos na viajem: " + kmporlitro);
            System.out.println();
            System.out.println("Olha só! hora de abastecer!");
            System.out.println();
            tanque += litrosgasolina;
            System.out.println("agora você tem " + tanque + " Litros de Gasolina! ");
            System.out.println();
            System.out.println("________________________________________");


        }
    }


