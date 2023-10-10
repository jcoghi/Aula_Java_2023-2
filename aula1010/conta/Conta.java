package aula1010.conta;

/**
 * @author joaof
 */
public class Conta {

    private int numConta;
    private int numBanco = 1;
    private float saldo;
    private String dono;

    public Conta(float saldo, String dono) {
        numConta = (int) (Math.random() * 100);
        this.saldo = saldo;
        this.dono = dono;
    }
   
    // MÉTODOS
    
    public int getNumBanco() {
        return numBanco;
    }
    
    public void setNumBanco(int novoNumero) {
        numBanco = novoNumero;
    }
    
    public String getDono() {
        return dono;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void deposito(float valor) {
        saldo += valor;
    }
    
    // Só pode sacar até o saldo da conta
    public boolean saque(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    String mensagem = (saque(50)) ? "" : "";
    
    public boolean tranfere(Conta destinatario ,float valor) {
        if (this.saldo >= valor) {
            saldo -= valor;
            destinatario.saldo += valor;
            return true;
        }
        return false;
    }
    
    
}
