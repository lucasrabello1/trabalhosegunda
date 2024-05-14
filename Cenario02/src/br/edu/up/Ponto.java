package br.edu.up;

import java.lang.Math;

    class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double distanciaX = outroPonto.getX() - this.x;
        double distanciaY = outroPonto.getY() - this.y;
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distanciaX = x2 - x1;
        double distanciaY = y2 - y1;
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }
}