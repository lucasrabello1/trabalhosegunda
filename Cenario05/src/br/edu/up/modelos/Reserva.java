package br.edu.up.modelos;

import java.time.LocalDate;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private LocalDate dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoas, LocalDate dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    
}