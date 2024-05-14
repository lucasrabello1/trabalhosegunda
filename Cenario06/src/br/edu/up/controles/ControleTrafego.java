package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ControleTrafego {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;
    private Aeronave aeronave;

    public ControleTrafego() {
        this.passageiros = new ArrayList<>();
        this.tripulacao = new ArrayList<>();
        // Inicializar aeronave
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void removerPassageiro(Passageiro passageiro) {
        passageiros.remove(passageiro);
    }

    public List<Passageiro> listarPassageiros() {
        return passageiros;
    }

    public void adicionarTripulacao(Tripulacao membroTripulacao) {
        tripulacao.add(membroTripulacao);
    }

    public void removerTripulacao(Tripulacao membroTripulacao) {
        tripulacao.remove(membroTripulacao);
    }

    public List<Tripulacao> listarTripulacao() {
        return tripulacao;
    }

    public void definirAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Aeronave obterAeronave() {
        return aeronave;
    }
}

