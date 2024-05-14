package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private static final int NUM_VAGAS = 10;
    private List<Veiculo> veiculosEstacionados;

    public Estacionamento() {
        this.veiculosEstacionados = new ArrayList<>();
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (veiculosEstacionados.size() < NUM_VAGAS) {
            veiculosEstacionados.add(veiculo);
            return true;
        }
        return false;
    }

    public boolean saidaVeiculo(String placa) {
        for (Veiculo veiculo : veiculosEstacionados) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculosEstacionados.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public int getVagasDisponiveis() {
        return NUM_VAGAS - veiculosEstacionados.size();
    }

    public int getQuantidadeVeiculosEstacionados() {
        return veiculosEstacionados.size();
    }
}