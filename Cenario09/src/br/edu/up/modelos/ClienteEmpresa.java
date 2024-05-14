package br.edu.up.modelos;

public class ClienteEmpresa {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;
    private double credito;

    public ClienteEmpresa(String cnpj, String inscEstadual, int anoFundacao, double credito) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
        this.credito = credito;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getSaldo() {
        return credito;
    }

    public String getDados() {
        return "CNPJ: " + cnpj + ", Inscrição Estadual: " + inscEstadual + ", Ano de Fundação: " + anoFundacao + ", Crédito: R$" + credito;
    }

    public String toString() {
        return "Cliente Empresa - " + getDados();
    }
}
