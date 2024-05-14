package br.edu.up;

public class Programa {
    public static void main(String[] args) {
        Ano ano = new Ano(2024, false);

        Mes janeiro = new Mes(31, "Janeiro");
        Mes fevereiro = new Mes(28, "Fevereiro");
        ano.adicionarMes(janeiro);
        ano.adicionarMes(fevereiro);


        Compromisso comp1 = new Compromisso("João", "Sala de Reunião", "Reunião de Equipe", 14);
        janeiro.adicionarCompromisso(comp1, 5); 

        Compromisso comp2 = new Compromisso("Maria", "Auditório", "Apresentação de Projeto", 10);
        janeiro.adicionarCompromisso(comp2, 10);

        Compromisso comp3 = new Compromisso("José", "Cafeteria", "Café com Cliente", 15);
        fevereiro.adicionarCompromisso(comp3, 3); 
 
        System.out.println("Compromissos do mês de Janeiro:");
        System.out.println(janeiro.listarCompromissos(5)); 

        System.out.println("Compromissos do mês de Fevereiro:");
        System.out.println(fevereiro.listarCompromissos(3));

        fevereiro.excluirCompromisso(3, 15);

        System.out.println("Compromissos do mês de Fevereiro após exclusão:");
        System.out.println(fevereiro.listarCompromissos(3));
    }
}

