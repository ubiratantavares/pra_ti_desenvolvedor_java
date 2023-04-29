package imc;

public class Imc {

    private double peso;
    private double altura;
    private double imc;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        this.imc = this.peso / (this.altura * this.altura);
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
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
