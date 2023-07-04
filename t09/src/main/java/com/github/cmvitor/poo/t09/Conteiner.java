package com.github.cmvitor.poo.t09;

import java.util.ArrayList;
public class Conteiner {
    public ArrayList<Elemento> elementos;
    public Conteiner() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElementos(Elemento elemento){
        elementos.add(elemento);
    }

    public void removerElementos(Elemento elemento){
        elementos.remove(elemento);
    }
    public ArrayList<Elemento> getElementos() {
        return elementos;
    }
}
