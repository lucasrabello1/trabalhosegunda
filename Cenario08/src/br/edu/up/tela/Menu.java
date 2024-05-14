package br.edu.up.tela;

import java.util.Scanner;
import br.edu.up.modelos.*;
import br.edu.up.controle.*;

;
public class Menu {
    private final Controle controle;
    private final Scanner scanner;

    public Menu() {
        this.controle = new Controle();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Incluir contato comercial");
            System.out.println("2. Incluir contato pessoal");
            System.out.println("3. Excluir contato");
            System.out.println("4. Consultar contato");
            System.out.println("5. Listar contatos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    incluirComercial();
                    break;
                case 2:
                    incluirPessoal();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    private void incluirComercial() {
        System.out.print("Digite o código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();
        controle.incluirComercial(codigo, nome, telefone, cnpj);
    }

    private void incluirPessoal() {
        System.out.print("Digite o código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o aniversário: ");
        String aniversario = scanner.nextLine();
        controle.incluirPessoal(codigo, nome, telefone, aniversario);
    }

    private void excluirContato() {
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        controle.excluirContato(codigo);
    }

    private void consultarContato() {
        System.out.print("Digite o código do contato a ser consultado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        Contato contato = controle.getContato(codigo);
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato.toString());
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    private void listarContatos() {
        System.out.println("Lista de contatos:");
        System.out.println(controle.listarContatos());
    }

    public static void main(String[] args) {
        Menu view = new Menu();
        view.exibirMenu();
    }
}

