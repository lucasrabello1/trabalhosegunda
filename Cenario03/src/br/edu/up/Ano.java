package br.edu.up;

public class Ano {
    public int ano;
    public boolean bissexto;
    public Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
    }

    public void adicionarMes(Mes mes) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] == null) {
                meses[i] = mes;
                break;
            }
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                break;
            }
        }
    }

    public String listarCompromissos(String nomeMes) {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equalsIgnoreCase(nomeMes)) {
                sb.append("Compromissos do mês de ").append(nomeMes).append(":\n");
                sb.append(mes.listarCompromissos());
                return sb.toString();
            }
        }
        return "Mês não encontrado!";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            if (mes != null) {
                sb.append("Compromissos do mês de ").append(mes.getNome()).append(":\n");
                sb.append(mes.listarCompromissos());
            }
        }
        return sb.toString();
    }
}
