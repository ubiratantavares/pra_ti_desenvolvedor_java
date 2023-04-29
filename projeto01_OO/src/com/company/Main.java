package com.company;

import imc.Imc;
import imc.ImcLeitura;
import imc.ImcNovo;

public class Main {

    public static boolean f(int x,int y) {
        if (x==0) return true;
        if (y==1) return false;
        return (x>y);
    }

    public static void main(String[] args) {
        /*
        double peso = 80;
        double altura = 1.80;
        double imc = peso/(altura * altura);
        System.out.println("O IMC é " + imc);


        Imc imc1 = new Imc(80, 2.10);
        imc1.calcularImc();
        System.out.println("A classificação é " + imc1.classificacao() + ".");

        Imc imc2 = new ImcNovo(80, 2.10);
        imc2.calcularImc();
        System.out.println("A classificação é " + imc2.classificacao() + ".");

        ImcLeitura imc3 = new ImcLeitura();
        imc3.lerPeso();
        imc3.lerAltura();

        System.out.println("A classificação é " + imc3.classificacao() + ".");

         */

        // propriedades e métodos estáticos
        Objetos obj1 = new Objetos(10);
        obj1.setValor1(20);
        Objetos.setValor2(200);

        System.out.println("Valores são + " + obj1.getValor1() + " e " + Objetos.getValor2());

        Objetos obj2 = new Objetos(11);
        obj2.setValor1(21);
        Objetos.setValor2(201);

        System.out.println("Valores são + " + obj2.getValor1() + " e " + Objetos.getValor2());
        System.out.println("Valores são + " + obj1.getValor1() + " e " + Objetos.getValor2());

        Objetos.setValor2(30);

        System.out.println("Valores são " + obj2.getValor1() + " e " + Objetos.getValor2());
        System.out.println("Calcula  " + obj2.calcular());

        System.out.println("Valores são " + obj1.getValor1() + " e " + Objetos.getValor2());
        System.out.println("Calcula  " + obj1.calcular());

        // O método toString
        System.out.println(obj1);
        System.out.println(obj2);

        // percorrendo arrays com for
        int[] arrayInteiros = {10, 20, 30, 40, 50};

        for (int i = 0; i < arrayInteiros.length; i++) {
            System.out.println(arrayInteiros[i]);
        }

        System.out.println("-------------------------------------");

        for (int elemento : arrayInteiros) {
            System.out.println(elemento);
        }
    }
}
