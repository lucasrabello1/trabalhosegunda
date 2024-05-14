
import br.edu.up.modelos.*;
import br.edu.up.telas.*;
import br.edu.up.controles.*;

public class Programa {
    private static MenuTela menuTela = new MenuTela();
    private static ControleEvento controleEvento = new ControleEvento();
    private static ControleReserva controleReserva = new ControleReserva();

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int opcao;
        do {
            opcao = menuTela.mostrarMenu();
            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    adicionarReserva();
                    break;
                case 4:
                    listarReservas();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void adicionarEvento() {
        Evento evento = menuTela.solicitarDadosEvento();
        controleEvento.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    private static void listarEventos() {
        for (Evento evento : controleEvento.listarEventos()) {
            System.out.println(evento);
        }
    }

    private static void adicionarReserva() {
        Reserva reserva = menuTela.solicitarDadosReserva();
        controleReserva.adicionarReserva(reserva);
        System.out.println("Reserva adicionada com sucesso!");
    }

    private static void listarReservas() {
        for (Reserva reserva : controleReserva.listarReservas()) {
            System.out.println(reserva);
        }
    }
}

