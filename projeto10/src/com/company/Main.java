package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        AlunoBD alunoBD = new AlunoBD();
        Integer matricula;
        Aluno aluno;

        do {
            System.out.println("Digite a matricula: ");

            matricula = Integer.parseInt(sc.nextLine());

            if (matricula == 0) {
                continua = false;
            } else {
                aluno = alunoBD.buscarPorMatricula(matricula);
                if (aluno == null) {
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    aluno = new Aluno(matricula, nome);
                    alunoBD.salvar(aluno);
                    System.out.println("Número de matricula cadastrada com sucesso.");
                } else {
                    System.out.println("Número de matricula já cadastrada.");
                }
            }
        } while (continua);

        List<Aluno> alunos = alunoBD.buscarTodos();

        for (Aluno a : alunos) {
            System.out.println(a);
        }

        System.out.println("Digite a matricula a ser excluida: ");
        matricula = Integer.parseInt(sc.nextLine());

        alunoBD.excluirPorMatricula(matricula);

        alunos = alunoBD.buscarTodos();

        for (Aluno a : alunos) {
            System.out.println(a);
        }

        System.out.println("Digite a matricula a ser pesquisada: ");

        matricula = Integer.parseInt(sc.nextLine());

        aluno = alunoBD.buscarPorMatricula(matricula);

        if (aluno != null) System.out.println(aluno);
        else System.out.println("Número de matricula não cadastrada.");
    }
}
