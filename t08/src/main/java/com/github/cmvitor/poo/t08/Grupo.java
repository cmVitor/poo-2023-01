package com.github.cmvitor.poo.t08;
import java.util.ArrayList;

public class Grupo {

    public ArrayList<Permissao> permissoes;
    public ArrayList<Usuario> usuarios;

    public Grupo() {
        this.permissoes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

}
