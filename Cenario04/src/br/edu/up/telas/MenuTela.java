package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.modelos.Veiculo;

public class MenuTela {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Relatório de vagas disponíveis");
        System.out.println("4. Relatório de veículos estacionados");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Veiculo solicitarDadosVeiculo() {
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.next();
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.next();
        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.next();
        return new Veiculo(modelo, placa, cor);
    }

    public String solicitarPlacaVeiculo() {
        System.out.print("Digite a placa do veículo: ");
        return scanner.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}