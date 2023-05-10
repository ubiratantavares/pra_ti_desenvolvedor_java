package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Gato();
        Impressora.imprimir(animal);

        animal = new Cachorro();
        Impressora.imprimir(animal);
    }
}
