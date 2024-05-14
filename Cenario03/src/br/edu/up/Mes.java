package br.edu.up;

public class Mes {
    private int qtdeDias;
    private String nome;
    private Dia[] dias;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            this.dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            this.dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            System.out.println("Dia inválido!");
        }
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
        adicionarCompromisso(comp, diaMes);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            this.dias[diaMes - 1].excluirCompromisso(hora);
        } else {
            System.out.println("Dia inválido!");
        }
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            return this.dias[diaMes - 1].listarCompromissos();
        } else {
            return "Dia inválido!";
        }
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qtdeDias; i++) {
            sb.append("Dia ").append(i + 1).append(": \n").append(this.dias[i].listarCompromissos()).append("\n");
        }
        return sb.toString();
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    
}