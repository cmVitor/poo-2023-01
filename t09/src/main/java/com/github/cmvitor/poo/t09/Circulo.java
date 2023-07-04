package com.github.cmvitor.poo.t09;

import java.util.Scanner;

public class Circulo {

    public Ponto centro;
    public int raio;

    public Circulo(int raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }


    public int getRaio() {
        return raio;
    }

    public void transladar(int newX, int newY, Ponto ponto) {
        ponto.setX(newX);
        ponto.setY(newY);
    }
}
