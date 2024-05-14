package br.edu.up;
import br.edu.up.tela.*;
import br.edu.up.controle.*;

public class Programa {
    public static void main(String[] args) {

        ClienteView view = new ClienteView();
        
        ClienteController controller = new ClienteController(view);
        
        controller.executar();
    }
}