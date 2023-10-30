package aula1023.exemplo3;

/**
 *
 * @author joaof
 */
public class Main {

    public static void main(String[] args) {
        Aluno joao = new Aluno("João");
        Aluno felipe = new Aluno("Felipe");
        
        Curso java = new Curso("Java");
        Curso gastronomia = new Curso("Gastronomia");
        Curso python = new Curso("Python");
        Curso html = new Curso("html");
        
        //joao.adicionarCurso(html);
        html.adicionarAluno(joao);
        html.adicionarAluno(felipe);
        gastronomia.adicionarAluno(joao);
        python.adicionarAluno(felipe);
        
        System.out.println(felipe.cursos.get(0).nome);
        System.out.println(felipe.cursos.get(1).nome);

    }

}
