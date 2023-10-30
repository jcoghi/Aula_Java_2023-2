package aula1023.exemplo3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Curso {
    
    public String nome;
    public List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
    
    
}
