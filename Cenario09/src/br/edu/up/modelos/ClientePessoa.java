package br.edu.up.modelos;


public class ClientePessoa {
    private String CPF;
    private double peso;
    private double altura;
    private double credito;
    private Endereco endereco;

    public ClientePessoa(String CPF, double peso, double altura, Endereco endereco, double credito) {
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
        this.endereco = endereco;
        this.credito = credito;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}