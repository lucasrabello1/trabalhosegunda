package br.edu.up.controle;

import br.edu.up.modelos.*;
import br.edu.up.tela.*;
import java.util.ArrayList;

public class ClienteController {
    private ClienteView view;
    private ArrayList<ClientePessoa> clientesPessoa;
    private ArrayList<ClienteEmpresa> clientesEmpresa;

    public ClienteController(ClienteView view) {
        this.view = view;
        this.clientesPessoa = new ArrayList<>();
        this.clientesEmpresa = new ArrayList<>();
    }

    public void executar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolverClientePessoa();
                    break;
                case 8:
                    devolverClienteEmpresa();
                    break;
                case 9:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    private void incluirClientePessoa() {
        System.out.println("Incluir cliente pessoa selecionado.");

    }

    private void incluirClienteEmpresa() {
        System.out.println("Incluir cliente empresa selecionado.");

    }

    private void mostrarDadosClientePessoa() {
        System.out.println("Mostrar dados cliente pessoa selecionado.");

    }

    private void mostrarDadosClienteEmpresa() {
        System.out.println("Mostrar dados cliente empresa selecionado.");

    }

    private void emprestarParaClientePessoa() {
        System.out.println("Emprestar para cliente pessoa selecionado.");

    }

    private void emprestarParaClienteEmpresa() {
        System.out.println("Emprestar para cliente empresa selecionado.");

    }

    private void devolverClientePessoa() {
        System.out.println("Devolução de cliente pessoa selecionado.");

    }

    private void devolverClienteEmpresa() {
        System.out.println("Devolução de cliente empresa selecionado.");

    }
}
