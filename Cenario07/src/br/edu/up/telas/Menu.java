package br.edu.up.telas;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Gerenciar Professores");
            System.out.println("2. Gerenciar Alunos");
            System.out.println("3. Gerenciar Disciplinas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    menuProfessores();
                    break;
                case 2:
                    menuAlunos();
                    break;
                case 3:
                    menuDisciplinas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void menuProfessores() {
        int opcao;
        do {
            System.out.println("=== Gerenciar Professores ===");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Remover Professor");
            System.out.println("3. Atualizar Professor");
            System.out.println("4. Obter Professor por Matrícula");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProfessor();
                    break;
                case 2:
                    removerProfessor();
                    break;
                case 3:
                    atualizarProfessor();
                    break;
                case 4:
                    obterProfessorPorMatricula();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void adicionarProfessor() {
    }

    private static void removerProfessor() {
    }

    private static void atualizarProfessor() {
    }

    private static void obterProfessorPorMatricula() {
    }


    private static void menuAlunos() {
    }

    private static void menuDisciplinas() {
    }
}
