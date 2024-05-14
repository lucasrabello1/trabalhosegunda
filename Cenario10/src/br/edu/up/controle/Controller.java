package br.edu.up.controle;

import br.edu.up.tela.*;
import br.edu.up.modelos.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private ArrayList<Seguro> seguros;
    private View view;
    private Scanner scanner;

    public Controller() {
        seguros = new ArrayList<>();
        view = new View();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    mostrarQuantidadeSeguros();
                    break;
                case 7:
                    view.mostrarMensagem("Encerrando o programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        view.mostrarMensagem("Incluir seguro selecionado.");
        view.mostrarMensagem("Escolha o tipo de seguro:");
        view.mostrarMensagem("1. Seguro de Vida");
        view.mostrarMensagem("2. Seguro de Veículo");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                SeguroVida seguroVida = criarSeguroVida();
                if (seguroVida != null) {
                    if (verificarApliceExistente(seguroVida.getApolice())) {
                        view.mostrarMensagem("Número de apólice já existe. Seguro não foi adicionado.");
                    } else {
                        seguros.add(seguroVida);
                        view.mostrarMensagem("Seguro de Vida adicionado com sucesso!");
                    }
                }
                break;
            case 2:
                SeguroVeiculo seguroVeiculo = criarSeguroVeiculo();
                if (seguroVeiculo != null) {
                    if (verificarApliceExistente(seguroVeiculo.getApolice())) {
                        view.mostrarMensagem("Número de apólice já existe. Seguro não foi adicionado.");
                    } else {
                        seguros.add(seguroVeiculo);
                        view.mostrarMensagem("Seguro de Veículo adicionado com sucesso!");
                    }
                }
                break;
            default:
                view.mostrarMensagem("Opção inválida.");
        }
    }

    private SeguroVida criarSeguroVida() {
        view.mostrarMensagem("Digite o número da apólice:");
        String apolice = scanner.nextLine();
        view.mostrarMensagem("Digite a valor da apólice:");
        double vlrApolice = scanner.nextDouble();
        scanner.nextLine();

        Segurado segurado = criarSegurado();

        view.mostrarMensagem("Cobre doença (S/N):");
        boolean cobreDoenca = scanner.nextLine().equalsIgnoreCase("S");
        view.mostrarMensagem("Cobre acidente (S/N):");
        boolean cobreAcidente = scanner.nextLine().equalsIgnoreCase("S");
        view.mostrarMensagem("Digite a data de início do seguro (AAAA-MM-DD):");
        LocalDate dtInicio = LocalDate.parse(scanner.nextLine());
        view.mostrarMensagem("Digite a data de fim do seguro (AAAA-MM-DD):");
        LocalDate dtFim = LocalDate.parse(scanner.nextLine());


        return new SeguroVida(apolice,segurado,vlrApolice,dtInicio , dtFim,cobreDoenca, cobreAcidente);
    }

    private Segurado criarSegurado() {
        view.mostrarMensagem("Digite o nome do segurado:");
        String nome = scanner.nextLine();
        view.mostrarMensagem("Digite o RG do segurado:");
        String rg = scanner.nextLine();
        view.mostrarMensagem("Digite o CPF do segurado:");
        String cpf = scanner.nextLine();
        view.mostrarMensagem("Digite o sexo do segurado (M/F):");
        String sexo = scanner.nextLine();
        view.mostrarMensagem("Digite o telefone do segurado:");
        String telefone = scanner.nextLine();
        view.mostrarMensagem("Digite o endereço do segurado:");
        String endereco = scanner.nextLine();
        view.mostrarMensagem("Digite o CEP do segurado:");
        String cep = scanner.nextLine();
        view.mostrarMensagem("Digite a cidade do segurado:");
        String cidade = scanner.nextLine();

        return new Segurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
    }

    private SeguroVeiculo criarSeguroVeiculo() {
        view.mostrarMensagem("Digite o número da apólice:");
        String apolice = scanner.nextLine();
        view.mostrarMensagem("Digite a valor da apólice:");
        double vlrApolice = scanner.nextDouble();
        scanner.nextLine();

        Segurado segurado = criarSegurado();

        view.mostrarMensagem("Digite o valor da franquia:");
        double vlrFranquia = scanner.nextDouble();
        scanner.nextLine(); 
        view.mostrarMensagem("Tem carro reserva (S/N):");
        boolean temCarroReserva = scanner.nextLine().equalsIgnoreCase("S");
        view.mostrarMensagem("Cobre vidros (S/N):");
        boolean cobreVidros = scanner.nextLine().equalsIgnoreCase("S");
        view.mostrarMensagem("Digite a data de início do seguro (AAAA-MM-DD):");
        LocalDate dtInicio = LocalDate.parse(scanner.nextLine());
        view.mostrarMensagem("Digite a data de fim do seguro (AAAA-MM-DD):");
        LocalDate dtFim = LocalDate.parse(scanner.nextLine());
        scanner.nextLine();


        return new SeguroVeiculo(apolice,segurado,vlrApolice,  dtInicio,  dtFim,  vlrFranquia,  temCarroReserva,  cobreVidros);
    }

    private boolean verificarApliceExistente(String apolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                return true;
            }
        }
        return false;
    }

    private void localizarSeguro() {
        view.mostrarMensagem("Digite o número da apólice do seguro que deseja localizar:");
        String apolice = scanner.nextLine();
        boolean encontrado = false;
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                view.mostrarMensagem("Seguro encontrado:\n" + seguro.getDados());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }
    
    private void excluirSeguro() {
        view.mostrarMensagem("Digite o número da apólice do seguro que deseja excluir:");
        String apolice = scanner.nextLine();
        boolean removido = false;
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                seguros.remove(seguro);
                view.mostrarMensagem("Seguro removido com sucesso.");
                removido = true;
                break;
            }
        }
        if (!removido) {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }
    
    private void excluirTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Não há seguros para excluir.");
        } else {
            boolean confirmacao = view.confirmarAcao("Tem certeza que deseja excluir todos os seguros? (S/N): ");
            if (confirmacao) {
                seguros.clear();
                view.mostrarMensagem("Todos os seguros foram excluídos.");
            } else {
                view.mostrarMensagem("Ação de exclusão cancelada.");
            }
        }
    }
    
    private void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Não há seguros cadastrados.");
        } else {
            view.mostrarMensagem("Lista de todos os seguros:");
            for (Seguro seguro : seguros) {
                view.mostrarMensagem(seguro.getDados());
            }
        }
    }
    
    private void mostrarQuantidadeSeguros() {
        int quantidade = seguros.size();
        view.mostrarMensagem("Quantidade de seguros cadastrados: " + quantidade);
    }
    
}
