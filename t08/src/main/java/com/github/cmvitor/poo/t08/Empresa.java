package com.github.cmvitor.poo.t08;

import java.util.ArrayList;

public class Empresa {

    public ArrayList<Emprego> empregos;
    public ArrayList<Pessoa> pessoas;

    public Empresa() {
        this.empregos = new ArrayList<>();
        this.pessoas = new ArrayList<>();
    }

    public void adicionarEmprego(Emprego emprego){
        empregos.add(emprego);
    }

    public void removeEmprego(Emprego emprego){
        empregos.remove(emprego);
    }

    public ArrayList<Emprego> getEmpregos() {
        return empregos;
    }

    public void contratarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void demitirPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}