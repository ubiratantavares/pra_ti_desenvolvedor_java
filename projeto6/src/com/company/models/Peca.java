package com.company.models;

import java.util.Random;

public class Peca {

    private int x;
    private int y;
    private boolean vivo;

    public Peca() {
        Random aleatorio = new Random();
        this.x = aleatorio.nextInt(10);
        this.y = aleatorio.nextInt(10);
        this.vivo = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double disparo(int x , int y) {
        double distancia = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        if (distancia == 0) this.vivo = false;
        return distancia;
    }

    public boolean isVivo() {
        return vivo;
    }
}
