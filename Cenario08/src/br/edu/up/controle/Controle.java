
package br.edu.up.controle;
import br.edu.up.modelos.*;

public class Controle {
    private final Agenda agenda;

    public Controle() {
        this.agenda = new Agenda();
    }

    public void incluirComercial(int codigo, String nome, String telefone, String cnpj) {
        agenda.incluirComercial(codigo, nome, telefone, cnpj);
    }

    public void incluirPessoal(int codigo, String nome, String telefone, String aniversario) {
        agenda.incluirPessoal(codigo, nome, telefone, aniversario);
    }

    public Contato getContato(int codigo) {
        return agenda.getContato(codigo);
    }

    public void excluirContato(int codigo) {
        agenda.excluirContato(codigo);
    }

    public String listarContatos() {
        return agenda.listarContatos();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public Controle(Agenda agenda) {
        this.agenda = agenda;
    }
    
}