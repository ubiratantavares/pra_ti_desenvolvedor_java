package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("José");
        nomes.add("João");

        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("-------------------------------------");

        nomes.removeIf(nome -> nome.equalsIgnoreCase("Ana"));

        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("-------------------------------------");

        nomes.removeIf(nome -> nome.startsWith("J"));

        nomes.forEach(nome -> System.out.println(nome));
    }
}
