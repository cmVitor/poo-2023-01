package com.github.cmvitor.poo.t21;

import java.util.Objects;

public class Preco {

    private double value;
    private Moeda moeda;

    public Preco(double value, Moeda moeda) {
        if(value < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        Objects.requireNonNull(moeda, "Moeda inválida"); //Mesma coisa de mandar uma nova exception de moeda nula.

        this.value = value;
        this.moeda = moeda;
    }

    public double getValue() {
        return value;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    @Override
    public String toString() {
        return "Preco{" +
                "value=" + value +
                ", moeda=" + moeda +
                '}';
    }

    public static void main(String[] args) {
        Preco preco = new Preco(12.2, Moeda.DOLLAR);
        System.out.println(preco); //Chama o método toString.
    }
}
