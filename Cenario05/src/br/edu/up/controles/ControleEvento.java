package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ControleEvento {
    private List<Evento> eventos;

    public ControleEvento() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public boolean verificarDisponibilidadeIngressos(Evento evento, int quantidadeIngressos) {
        int ingressosDisponiveis = evento.getLotacaoMaxima() - evento.getIngressosVendidos();
        return ingressosDisponiveis >= quantidadeIngressos;
    }

    public boolean venderIngressos(Evento evento, int quantidadeIngressos) {
        if (verificarDisponibilidadeIngressos(evento, quantidadeIngressos)) {
            evento.setIngressosVendidos(evento.getIngressosVendidos() + quantidadeIngressos);
            return true;
        } else {
            return false;
        }
    }
}