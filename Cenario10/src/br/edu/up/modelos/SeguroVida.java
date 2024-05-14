package br.edu.up.modelos;

import java.time.LocalDate;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, LocalDate dtInicio, LocalDate dtFim, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado, vlrApolice, dtInicio, dtFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    public String getDados() {
        return "Seguro de Vida: Apólice " + getApolice() + ", Segurado: " + getSegurado().getNome();
    }  
}

