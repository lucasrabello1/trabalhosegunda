package br.edu.up.modelos;

import java.util.List;

public class Comissario extends Tripulacao {
    private List<String> idiomasFluencia;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, List<String> idiomasFluencia) {
        super(nome, rg);
        this.idiomasFluencia = idiomasFluencia;
    }

    public List<String> getIdiomasFluencia() {
        return idiomasFluencia;
    }

    public void setIdiomasFluencia(List<String> idiomasFluencia) {
        this.idiomasFluencia = idiomasFluencia;
    }

}
