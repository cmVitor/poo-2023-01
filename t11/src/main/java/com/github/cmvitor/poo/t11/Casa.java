package com.github.cmvitor.poo.t11;

import java.util.ArrayList;

public class Casa {

    private ArrayList<Garagem> garagens;
    private ArrayList<Sala> salas;
    private ArrayList<Area> areas;
    private ArrayList<Quarto> quartos;
    private ArrayList<Banheiro> banheiros;

    public Casa() {
        this.garagens = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.banheiros = new ArrayList<>();
    }

    public ArrayList<Garagem> getGaragens() {
        return garagens;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public ArrayList<Banheiro> getBanheiros() {
        return banheiros;
    }
}
