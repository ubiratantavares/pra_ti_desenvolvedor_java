package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<String>();

        // nao aceita elemento null
        Set<String> alunos2 = new TreeSet<String>();

        alunos.add("José da Silva");
        alunos.add("Maria Clara");
        alunos.add("João Oliveira");
        alunos.add("Ana da Silva");
        alunos.add("José da Silva");

        System.out.println(alunos);

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos2.add("José da Silva");
        alunos2.add("Maria Clara");
        alunos2.add("João Oliveira");
        alunos2.add("Ana da Silva");
        alunos2.add("José da Silva");

        System.out.println(alunos2);

        for (String aluno : alunos2) {
            System.out.println(aluno);
        }

        alunos2.remove("João Oliveira");

        System.out.println(alunos2);

        for (String aluno : alunos2) {
            System.out.println(aluno);
        }

        System.out.println(alunos2.size());
        System.out.println(alunos2.isEmpty());
    }
}
