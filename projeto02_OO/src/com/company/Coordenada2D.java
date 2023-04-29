package com.company;

public class Coordenada2D {

    protected int valor_x;
    protected int valor_y;

    public Coordenada2D(int valor_x, int valor_y) {
        this.valor_x = valor_x;
        this.valor_y = valor_y;
    }

    @Override
    public String toString() {
        return "(" + this.valor_x + ", " + this.valor_y + ")";
    }

    public void exibe() {
        System.out.println(this);
    }
}
