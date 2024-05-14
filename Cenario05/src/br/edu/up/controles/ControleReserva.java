package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ControleReserva {
    private List<Reserva> reservas;

    public ControleReserva() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
