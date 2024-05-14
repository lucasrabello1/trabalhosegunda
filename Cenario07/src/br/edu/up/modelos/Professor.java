package br.edu.up.modelos;

public class Professor {
    private String nome;
    private String RG;
    private String matricula;
    private String numLattes;
    private String titulacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rG) {
        RG = rG;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNumLattes() {
        return numLattes;
    }
    public void setNumLattes(String numLattes) {
        this.numLattes = numLattes;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}