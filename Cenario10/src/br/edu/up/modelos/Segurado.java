package br.edu.up.modelos;

public class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private String sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    public Segurado(String nome, String RG, String CPF, String sexo, String telefone, String endereco, String CEP, String cidade) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CEP = CEP;
        this.cidade = cidade;
    }

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}