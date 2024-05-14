package br.edu.up;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    public int diaMes;
    private List<Compromisso> compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromissos.add(comp);
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp.getHora() == hora) {
                return comp;
            }
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        compromissos.removeIf(comp -> comp.getHora() == hora);
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso comp : compromissos) {
            sb.append(comp).append("\n");
        }
        return sb.toString();
    }
}