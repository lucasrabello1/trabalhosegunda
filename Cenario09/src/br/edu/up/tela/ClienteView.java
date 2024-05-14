package br.edu.up.tela;
import java.util.Scanner;

public class ClienteView {
    private Scanner scanner;

    public ClienteView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public double lerValor() {
        System.out.print("Digite o valor: ");
        return scanner.nextDouble();
    }
}
