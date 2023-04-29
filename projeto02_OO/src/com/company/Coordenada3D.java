package com.company;

public class Coordenada3D extends Coordenada2D {

    private int valor_z;

    public Coordenada3D(int valor_x, int valor_y, int valor_z) {
        super(valor_x, valor_y);
        this.valor_z = valor_z;
    }

    @Override
    public String toString() {
        return "(" + this.valor_x + ", " + this.valor_y + ", " + this.valor_z + ")";
    }

    public void exibe() {
        System.out.println(this);
    }
}
