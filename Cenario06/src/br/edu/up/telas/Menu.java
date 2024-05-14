package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.modelos.Tripulacao;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Aeronave;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Remover passageiro");
        System.out.println("3. Listar passageiros");
        System.out.println("4. Adicionar tripulação");
        System.out.println("5. Remover tripulação");
        System.out.println("6. Listar tripulação");
        System.out.println("7. Definir aeronave");
        System.out.println("8. Obter informações da aeronave");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Passageiro solicitarDadosPassageiro() {
        System.out.print("Nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("RG do passageiro: ");
        String rg = scanner.nextLine();
        return new Passageiro(nome, rg);
    }

    public Tripulacao solicitarDadosTripulacao() {
        System.out.print("Nome do membro da tripulação: ");
        String nome = scanner.next();
        System.out.print("RG do membro da tripulação: ");
        String rg = scanner.next();
        return new Tripulacao(nome, rg);
    }

    public Aeronave solicitarDadosAeronave() {;
        System.out.println("Informe os dados da aeronave:");
        System.out.print("Código da aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Tipo da aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade de assentos da aeronave: ");
        int quantidadeAssentos = scanner.nextInt();
    
        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        scanner.close();
        return aeronave;
    }
    


}

