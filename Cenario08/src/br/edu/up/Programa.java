package br.edu.up;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

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
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código: ");
                    int codigoC = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome: ");
                    String nomeC = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefoneC = scanner.nextLine();
                    System.out.print("Digite o CNPJ: ");
                    String cnpj = scanner.nextLine();
                    agenda.incluirComercial(codigoC, nomeC, telefoneC, cnpj);
                    break;
                case 2:
                    System.out.print("Digite o código: ");
                    int codigoP = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefoneP = scanner.nextLine();
                    System.out.print("Digite o aniversário: ");
                    String aniversario = scanner.nextLine();
                    agenda.incluirPessoal(codigoP, nomeP, telefoneP, aniversario);
                    break;
                case 3:
                    System.out.print("Digite o código do contato a ser excluído: ");
                    int codigoExcluir = scanner.nextInt();
                    scanner.nextLine();
                    agenda.excluirContato(codigoExcluir);
                    break;
                case 4:
                    System.out.print("Digite o código do contato a ser consultado: ");
                    int codigoConsultar = scanner.nextInt();
                    scanner.nextLine(); 
                    Contato contato = agenda.getContato(codigoConsultar);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato.toString());
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Lista de contatos:");
                    System.out.println(agenda.listarContatos());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}
