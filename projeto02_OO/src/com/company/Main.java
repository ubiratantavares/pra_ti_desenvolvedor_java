package com.company;

public class Main {

    public static void main(String[] args) {

        Coordenada2D[] coordenadas2D = new Coordenada2D[4];

        coordenadas2D[0] = new Coordenada2D(10, 20);
        coordenadas2D[1] = new Coordenada2D(30, 40);
        coordenadas2D[2] = new Coordenada2D(40, 50);
        coordenadas2D[3] = new Coordenada2D(40, 50);

        for (Coordenada2D coordenada : coordenadas2D) {
            System.out.println(coordenada);
        }

        System.out.println("-------------------------------------");

        for (Coordenada2D coordenada : coordenadas2D) {
            coordenada.exibe();
        }

        System.out.println("-------------------------------------");

        Coordenada3D[] coordenadas3D = new Coordenada3D[4];

        coordenadas3D[0] = new Coordenada3D(10, 20, 30);
        coordenadas3D[1] = new Coordenada3D(20, 30, 40);
        coordenadas3D[2] = new Coordenada3D(30, 40, 50);
        coordenadas3D[3] = new Coordenada3D(40, 50, 60);

        for (Coordenada3D coordenada : coordenadas3D) {
            System.out.println(coordenada);
        }

        System.out.println("-------------------------------------");

        for (Coordenada3D coordenada : coordenadas3D) {
            coordenada.exibe();
        }
    }
}
