package com.company;

import java.util.Locale;

public class Aluno {

    private Integer matricula;
    private String nome;
    private String email;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = nome.toLowerCase().replaceAll(" ", ".") + matricula + "@algamidia.com.br";
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(Integer matricula, String nome) {
        this.email = nome.toLowerCase().replaceAll(" ", ".") + matricula + "@algamidia.com.br";
    }

    @Override
    public String toString() {
        return "Matricula: " + this.getMatricula() + "\n" + "Nome: " + this.getNome() + "\n" + "Email: " + this.getEmail() + "\n";
    }
}
