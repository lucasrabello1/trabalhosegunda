package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class DisciplinaControle {
    private List<Disciplina> disciplinas;

    public DisciplinaControle() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(String identificador) {
        disciplinas.removeIf(disciplina -> disciplina.getIdentificador().equals(identificador));
    }

    public void atualizarDisciplina(Disciplina disciplinaAtualizada) {
        for (int i = 0; i < disciplinas.size(); i++) {
            Disciplina disciplina = disciplinas.get(i);
            if (disciplina.getIdentificador().equals(disciplinaAtualizada.getIdentificador())) {
                disciplinas.set(i, disciplinaAtualizada);
                break;
            }
        }
    }

    public Disciplina obterDisciplinaPorIdentificador(String identificador) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getIdentificador().equals(identificador)) {
                return disciplina;
            }
        }
        return null;
    }
}
