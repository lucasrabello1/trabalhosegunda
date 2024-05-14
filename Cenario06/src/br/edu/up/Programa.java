package br.edu.up;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class Programa {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Passageiro> passageiros = new ArrayList<>();
    private static List<Tripulacao> tripulacao = new ArrayList<>();
    private static Aeronave aeronave;

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = mostrarMenu();

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulacao();
                    break;
                case 3:
                    definirAeronave();
                    break;
                case 4:
                    listarPassageiros();
                    break;
                case 5:
                    listarTripulacao();
                    break;
                case 6:
                    exibirInformacoesAeronave();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 7);
    }

    public static int mostrarMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Adicionar Passageiro");
        System.out.println("2. Adicionar Tripulação");
        System.out.println("3. Definir Aeronave");
        System.out.println("4. Listar Passageiros");
        System.out.println("5. Listar Tripulação");
        System.out.println("6. Exibir Informações da Aeronave");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public static void adicionarPassageiro() {
        System.out.println("Passageiro adicionado com sucesso!");
    }

    public static void adicionarTripulacao() {
        System.out.println("Tripulante adicionado com sucesso!");
    }

    public static void definirAeronave() {
        System.out.println("Aeronave definida com sucesso!");
    }

    public static void listarPassageiros() {
        System.out.println("===== LISTA DE PASSAGEIROS =====");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro);
        }
    }

    public static void listarTripulacao() {
        System.out.println("===== LISTA DE TRIPULAÇÃO =====");
        for (Tripulacao tripulante : tripulacao) {
            System.out.println(tripulante);
        }
    }

    public static void exibirInformacoesAeronave() {
        System.out.println("===== INFORMAÇÕES DA AERONAVE =====");
        System.out.println(aeronave);
    }
}
