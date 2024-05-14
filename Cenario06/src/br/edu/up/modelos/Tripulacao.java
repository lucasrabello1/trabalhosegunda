package br.edu.up.modelos;
import java.util.List;

public class Tripulacao {
    private String nome;
    private String rg;

    public Tripulacao(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public int calcularTotalHorasVoo() {
        int totalHorasVoo = 0;

        return totalHorasVoo;
    }
 
    public List<String> getIdiomasFluencia() {
        List<String> idiomas = null;

        return idiomas;
    }
}
