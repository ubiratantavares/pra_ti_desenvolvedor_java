package imc;

import java.util.Scanner;

public class ImcLeitura extends Imc {
    Scanner entrada;

    public ImcLeitura() {
        super(80, 1.8);
        entrada = new Scanner(System.in);
    }

    public ImcLeitura(double peso, double altura) {
        super(peso, altura);
        entrada = new Scanner(System.in);

    }

    public void lerPeso() {
        System.out.println("Entre com o peso: ");
        this.setAltura(entrada.nextDouble());
    }

    public void lerAltura() {
        System.out.println("Entre com a altura: ");
        this.setAltura(entrada.nextDouble());
    }

    public double lerDouble(String texto) {
        boolean continuarLeitura = true;
        double valor = 0;
        while (continuarLeitura) {
            System.out.println(texto);
            try {
                valor = Double.parseDouble((entrada.nextLine()));
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                System.out.println("Entrada com valoe inválido.");
            }
        }
        return valor;
    }
}
