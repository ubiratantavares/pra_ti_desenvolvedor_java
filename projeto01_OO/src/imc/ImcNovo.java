package imc;

public class ImcNovo extends Imc {

    public ImcNovo(double peso, double altura) {
        super(peso, altura);
    }

    public String classificacao() {
        this.calcularImc();
        if (this.imc < 16) return "Magreza grau III";
        if (this.imc < 17) return "Magreza grau II";
        if (this.imc < 18.5) return "Magreza grau I";
        if (this.imc < 25.0) return "Saudável";
        if (this.imc < 30) return "Sobrepeso";
        if (this.imc < 35) return "Obesidade moderada (grau I)";
        if (this.imc < 40) return "Obesidade severa (grau II)";
        return "Obesidade muito severa (grau III";
    }
}
