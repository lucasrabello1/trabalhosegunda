package br.edu.up.modelos;

import java.util.List;
import java.util.ArrayList;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void incluirComercial(int codigo, String nome, String telefone, String cnpj) {
        Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
        contatos.add(comercial);
    }

    public void incluirPessoal(int codigo, String nome, String telefone, String aniversario) {
        Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        contatos.add(pessoal);
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public String listarContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            sb.append(contato.toString()).append("\n");
        }
        return sb.toString();
    }
}

