
package aula1031.exercicio01;

/**
 *
 * @author joaof
 */
public enum BancoDados {
    JOAO("João", "41"),
    FELIPE("Felipe", "25"),
    MIGUEL("Miguel", "5"),
    BRUNO("Bruno", "18");
    
    private String nome;
    private String idade;
    
    private BancoDados(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getIdade() {
        return idade;
    }
    
}
