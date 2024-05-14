package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public Cliente(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0.0;

    }

    public double getVlrEmprestado() {
        return vlrEmprestado;

    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

}
