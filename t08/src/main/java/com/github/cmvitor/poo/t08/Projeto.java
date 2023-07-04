package com.github.cmvitor.poo.t08;

import java.util.ArrayList;

public class Projeto {

    public ArrayList<Pessoa> pessoas;
    public ArrayList<Linguagem> linguagens;
    private String name;

    public Projeto(String name) {
        this.pessoas = new ArrayList<>();
        this.linguagens = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void adicionarLinguagens(Linguagem linguagem){
        linguagens.add(linguagem);
    }

    public ArrayList<Linguagem> getLinguagens() {
        return linguagens;
    }
}
