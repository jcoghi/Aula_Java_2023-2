package aula1010.funcionario;

/**
 * @author prof. João Felipe Coghi
 */
public class Funcionario {

    private String nome;
    private String funcao = "Vendedor";
    private int matricula;

    //Construtores
    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Funcionario(String nome, int matricula, String funcao) {
        this.nome = nome;
        this.matricula = matricula;
        this.funcao = funcao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    // Setters
    public void setMatricula(int novaMatricula) {
        matricula = novaMatricula;
    }

    public void setFuncao(String novaFuncao) {
        funcao = novaFuncao;
    }
}
