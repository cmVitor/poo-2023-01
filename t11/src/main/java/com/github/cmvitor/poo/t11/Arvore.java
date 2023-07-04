package com.github.cmvitor.poo.t11;

import java.util.ArrayList;

public class Arvore {

    private ArrayList<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public ArrayList<Folha> getFolhas() {
        return folhas;
    }
}
