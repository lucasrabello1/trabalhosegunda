package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class ProfessorControle {
    private List<Professor> professores;

    public ProfessorControle() {
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(String matricula) {
        professores.removeIf(professor -> professor.getMatricula().equals(matricula));
    }

    public void atualizarProfessor(Professor professorAtualizado) {
        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            if (professor.getMatricula().equals(professorAtualizado.getMatricula())) {
                professores.set(i, professorAtualizado);
                break;
            }
        }
    }

    public Professor obterProfessorPorMatricula(String matricula) {
        for (Professor professor : professores) {
            if (professor.getMatricula().equals(matricula)) {
                return professor;
            }
        }
        return null;
    }
}