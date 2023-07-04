package com.github.cmvitor.poo.t11;

import java.util.Date;

public class Prestacao {

    private double valor;
    private Date dataLimite;

    public Prestacao(double valor, Date dataLimite) {
        this.valor = valor;
        this.dataLimite = dataLimite;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataLimite() {
        return dataLimite;
    }
}
