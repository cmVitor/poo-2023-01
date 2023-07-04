package com.github.cmvitor.poo.t08;

import java.util.ArrayList;
public class Texto {
    public ArrayList<Paragrafo> paragrafos;

    public Texto() {
        this.paragrafos = new ArrayList<>();
    }

    public void adicionarParagrafo(Paragrafo paragrafo) {
        paragrafos.add(paragrafo);
    }

    public ArrayList<Paragrafo> getParagrafos() {
        return paragrafos;
    }

}
