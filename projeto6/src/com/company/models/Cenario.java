package com.company.models;

public class Cenario {
    int[][] mapa;
    String[] desenhos;
    Peca[] inimigos;
    private int pecasRestantes;
    private int tirosRestantes;

    public Cenario() {
        this.pecasRestantes = 5;
        this.tirosRestantes = this.pecasRestantes * 2;
        this.mapa = new int[this.pecasRestantes][this.pecasRestantes];
        this.desenhos = new String[] {".", "X", "*"};
        this.inimigos = new Peca[this.pecasRestantes];
        for (int i = 0; i < this.inimigos.length; i++) {
            this.inimigos[i] = new Peca();
        }
    }

    public int getPecasRestantes() {
        return pecasRestantes;
    }

    public void setPecasRestantes(int pecasRestantes) {
        this.pecasRestantes = pecasRestantes;
    }

    public void desenhaLinha(int[] linha) {
        String strLinha = "";
        for (int celula: linha) {
            strLinha += (this.desenhos[celula] + " ");
        }
        System.out.println(strLinha);
    }

    public void desenhaCenario() {
        for (int[] linha: this.mapa) {
            this.desenhaLinha(linha);
        }
        System.out.println("Peças restantes: " + this.pecasRestantes);
        System.out.println("Tiros restantes: " + this.tirosRestantes);
    }

    public boolean disparo(int x, int y) {
        this.tirosRestantes--;
        double distancia = 100;
        double distanciaAuxiliar = 0;
        for (Peca p : this.inimigos) {
            if (p.isVivo()) {
                distanciaAuxiliar = p.disparo(x, y);
                if (distanciaAuxiliar == 0) this.pecasRestantes--;
                distancia = (distanciaAuxiliar < distancia)?distanciaAuxiliar:distancia;
            }
        }
        System.out.println("===================================");
        System.out.println("Distancia: " + distancia);
        System.out.println("===================================");
        this.mapa[y][x] = (distancia > 0) ? 1 : 2;

        return (this.pecasRestantes > 0) && (this.tirosRestantes > 0) && (this.tirosRestantes >= this.pecasRestantes);
    }
}
