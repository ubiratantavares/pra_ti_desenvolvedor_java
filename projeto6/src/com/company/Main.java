package com.company;

import com.company.models.Cenario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cenario mapa = new Cenario();
        while (true) {
            System.out.println("Digite as coordenadas no formato x,y: ");
            String entrada = scanner.nextLine().toLowerCase();
            if (entrada.equals("fim")) break;
            else {
                String[] numeros = entrada.split(",");
                int x = Integer.parseInt(numeros[0]);
                int y = Integer.parseInt(numeros[1]);
                if (mapa.disparo(x, y)) {
                    mapa.desenhaCenario();
                }
                else {
                    mapa.desenhaCenario();
                    break;
                }
            }
        }
        if (mapa.getPecasRestantes() == 0) System.out.println("Você venceu o jogo.");
        else System.out.println("Você perdeu o jogo.");
    }
}
