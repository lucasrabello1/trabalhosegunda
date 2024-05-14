package br.edu.up.controles;

import br.edu.up.telas.MenuTela;
import br.edu.up.modelos.*;

public class ControleEstacionamento {

    private Estacionamento estacionamento;
    private MenuTela menuView;

    public ControleEstacionamento(Estacionamento estacionamento, MenuTela menuView) {
        this.estacionamento = estacionamento;
        this.menuView = menuView;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = menuView.mostrarMenu();
            switch (opcao) {
                case 1:
                    Veiculo veiculo = menuView.solicitarDadosVeiculo();
                    if (estacionamento.entradaVeiculo(veiculo)) {
                        menuView.mostrarMensagem("Veículo estacionado com sucesso!");
                    } else {
                        menuView.mostrarMensagem("Estacionamento lotado. Não é possível estacionar.");
                    }
                    break;
                case 2:
                    String placa = menuView.solicitarPlacaVeiculo();
                    if (estacionamento.saidaVeiculo(placa)) {
                        menuView.mostrarMensagem("Veículo retirado com sucesso!");
                    } else {
                        menuView.mostrarMensagem("Veículo não encontrado no estacionamento.");
                    }
                    break;
                case 3:
                    menuView.mostrarMensagem("Vagas disponíveis: " + estacionamento.getVagasDisponiveis());
                    break;
                case 4:
                    menuView.mostrarMensagem("Quantidade de veículos estacionados: " + estacionamento.getQuantidadeVeiculosEstacionados());
                    break;
                case 5:
                    menuView.mostrarMensagem("Saindo do programa.");
                    break;
                default:
                    menuView.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}

