package aula1023.exemplo3;

import java.util.ArrayList;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Aluno { 

    private int matricula = 0;
    public String nome;
    public ArrayList<Curso> cursos = new ArrayList<>();
    
    public Aluno(String nome) {
        this.matricula += 1;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void adicionarCurso(Curso curso) {
       this.cursos.add(curso);
       curso.alunos.add(this);
    }
    
    
}
