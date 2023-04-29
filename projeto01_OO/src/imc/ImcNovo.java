package imc;

public class ImcNovo extends Imc {

    public ImcNovo(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String classificacao() {
        this.calcularImc();
        if (this.getImc() < 16) return "Magreza grau III";
        if (this.getImc() < 17) return "Magreza grau II";
        if (this.getImc() < 18.5) return "Magreza grau I";
        if (this.getImc() < 25.0) return "Saudável";
        if (this.getImc() < 30) return "Sobrepeso";
        if (this.getImc() < 35) return "Obesidade moderada (grau I)";
        if (this.getImc() < 40) return "Obesidade severa (grau II)";
        return "Obesidade muito severa (grau III";
    }
}
