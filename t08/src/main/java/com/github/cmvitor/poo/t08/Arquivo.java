package com.github.cmvitor.poo.t08;

import java.util.ArrayList;

public class Arquivo {

    public ArrayList<Permissao> permissoes;

    public Arquivo() {
        this.permissoes = new ArrayList<>();
    }

    public void adicionarPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public ArrayList<Permissao> getPermissoes() {
        return permissoes;
    }
}
