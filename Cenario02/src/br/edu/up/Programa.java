package br.edu.up;


public class Programa {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();


        Ponto ponto2 = new Ponto(2, 5);


        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

        double distanciaPonto2Coordenadas = Ponto.calcularDistancia(ponto2.getX(), ponto2.getY(), 7, 2);
        System.out.println("Distância entre ponto2 e coordenadas (7,2): " + distanciaPonto2Coordenadas);

        ponto1.setX(10);

        ponto1.setY(3);
    }
}