package br.edu.up.telas;

import java.time.LocalDate;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class MenuTela {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Adicionar evento");
        System.out.println("2. Listar eventos");
        System.out.println("3. Adicionar reserva");
        System.out.println("4. Listar reservas");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Evento solicitarDadosEvento() {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do evento (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Lotação máxima do evento: ");
        int lotacaoMaxima = Integer.parseInt(scanner.nextLine());
        System.out.print("Preço do ingresso: ");
        double precoIngresso = Double.parseDouble(scanner.nextLine());

        return new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
    }

    public Reserva solicitarDadosReserva() {
        System.out.print("Nome do responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = Integer.parseInt(scanner.nextLine());
        System.out.print("Data da reserva (AAAA-MM-DD): ");
        LocalDate dataReserva = LocalDate.parse(scanner.nextLine());
        System.out.print("Valor total da reserva: ");
        double valorTotal = Double.parseDouble(scanner.nextLine());

        return new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
