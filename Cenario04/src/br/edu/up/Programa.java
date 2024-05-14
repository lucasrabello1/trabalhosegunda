// Programa.java
package br.edu.up;

import br.edu.up.modelos.*;
import br.edu.up.telas.MenuTela;
import br.edu.up.controles.ControleEstacionamento;


public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        MenuTela menuView = new MenuTela();
        ControleEstacionamento controller = new ControleEstacionamento(estacionamento, menuView);
        controller.iniciar();
    }
}
