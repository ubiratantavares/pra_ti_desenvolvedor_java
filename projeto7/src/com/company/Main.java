package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<String>();

        System.out.println(alunos.isEmpty());

        alunos.add("José da Silva");
        alunos.add("Maria Clara");
        alunos.add("João Roberto");

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos.get(0));

        System.out.println(alunos.isEmpty());

        System.out.println(alunos.remove(1));

        System.out.println(alunos.remove("José da Silva"));

        System.out.println(alunos.size());
    }
}
