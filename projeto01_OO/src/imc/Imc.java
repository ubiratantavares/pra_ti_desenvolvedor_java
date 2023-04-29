package imc;

public class Imc {

    public double peso;
    public double altura;
    public double imc;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularImc() {
        this.imc = this.peso / (this.altura * this.altura);
    }

    public String classificacao() {
        this.calcularImc();
        if (this.imc < 18.5) return "Magreza";
        if (this.imc < 24.9) return "Normal";
        if (this.imc < 29.9) return "Sobrepeso";
        if (this.imc < 39.9) return "Obesidade";
        return "Obesidade grave";
    }
}
