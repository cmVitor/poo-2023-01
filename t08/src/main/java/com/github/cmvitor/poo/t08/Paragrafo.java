package com.github.cmvitor.poo.t08;

import java.util.ArrayList;

public class Paragrafo {

    public ArrayList<Sentenca> sentencas;

    public Paragrafo() {
        this.sentencas = new ArrayList<>();
    }

    public void adicionarSentenca(Sentenca sentenca){
        sentencas.add(sentenca);
    }

    public ArrayList<Sentenca> getSentencas() {
        return sentencas;
    }

}
