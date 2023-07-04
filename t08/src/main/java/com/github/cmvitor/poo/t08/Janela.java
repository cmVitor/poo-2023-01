package com.github.cmvitor.poo.t08;

import java.util.ArrayList;

public class Janela{

    public int id;
    public ArrayList<ElementoInteracao> elementoInteracoes;

    public Janela(int id) {
        this.elementoInteracoes = new ArrayList<>();
        this.id = id;
    }

    public void adicionarElementoInteracao(ElementoInteracao elementoInteracao){
        elementoInteracoes.add(elementoInteracao);
    }

    public void removerElemento(ElementoInteracao elementoInteracao){
        elementoInteracoes.remove(elementoInteracao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
