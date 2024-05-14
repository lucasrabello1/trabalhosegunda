package br.edu.up.modelos;

import java.time.LocalDate;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, LocalDate dtInicio, LocalDate dtFim, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, dtInicio, dtFim);
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    public double getvlrFranquia() {
        return vlrFranquia;
    }

    public void setFranquia(double franquia) {
        this.vlrFranquia = franquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "Seguro de Veículo: Apólice " + getApolice() + ", Segurado: " + getSegurado().getNome();
    }
}

