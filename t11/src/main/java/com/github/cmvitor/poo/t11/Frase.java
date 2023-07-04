package com.github.cmvitor.poo.t11;

public class Frase {

    private String palavra;

    public Frase(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getTamanho() {
        return palavra.length();
    }
}
