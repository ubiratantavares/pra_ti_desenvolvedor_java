package com.company;

public class Impressora {

    // delimitação do tipo Generic
    public static <T  extends Animal> T imprimir(T t) {
        System.out.println(t);
        return t;
    }
}
