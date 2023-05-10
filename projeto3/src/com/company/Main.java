package com.company;

import java.util.Scanner;

public class Main {

    public static float calcularIMC(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public static String classificarIMC(float imc) {
        double[] imcs = {39.9, 29.9, 24.9, 18.5, 0};
        String[] classificacoes = {"Obesidade Grave", "Obesidade", "Sobrepeso", "Normal", "Magreza"};
        int indice = 0;
        while (imc < imcs[indice]) {
            indice++;
        }
        return classificacoes[indice];
    }

    public static void imprimirIMC(float imc) {
        System.out.println("IMC = " + imc);
    }

    public static void imprimirClassificacao(String classificacao) {
        System.out.println("Classificacao do IMC: " + classificacao);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o peso em kg: ");
        float peso = entrada.nextFloat();
        System.out.println("Informe a altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);
        imprimirIMC(imc);
        imprimirClassificacao(classificacao);
    }
}
