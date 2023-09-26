package aula0904;

public class Exemplo02 {

    public static void main(String[] args) {
        
        // DECLARAÇÃO E ATRIBUIÇÃO
        int num = 3;
        String menorOuNao;
        
        if (num < 0){
            menorOuNao = "Negativo"; 
        } else {
            menorOuNao = "Positivo";
        }
        
        System.out.println(menorOuNao);
    }

}
