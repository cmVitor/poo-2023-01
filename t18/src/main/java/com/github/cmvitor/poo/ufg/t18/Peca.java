package com.github.cmvitor.poo.ufg.t18;

public abstract class Peca {

    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public abstract void mover(Posicao origem, Posicao destino);
}
