package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> alunos = new HashMap<>();

        System.out.println(alunos.isEmpty());

        alunos.put(1, "José da Silva");
        alunos.put(2, "Maria Rodrigues");
        alunos.put(3, "João Mello");
        alunos.put(4, "Maria Clara");

        System.out.println(alunos);

        System.out.println(alunos.get(1));

        for (Integer id : alunos.keySet()) {
            System.out.println(alunos.get(id));
        }

        alunos.remove(0);


        Map<Integer, String> alunos2 = new TreeMap<>();

        System.out.println(alunos2.isEmpty());

        alunos2.put(1, "José da Silva");
        alunos2.put(2, "Maria Rodrigues");
        alunos2.put(3, "João Mello");
        alunos2.put(4, "Maria Clara");

        System.out.println(alunos2);
    }
}
