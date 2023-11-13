package aula1113;

import java.awt.Color;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Principal {

    public static void main(String[] args) {

        // Instanciando os nosso JFrames
        Loading telaLoanding = new Loading();
        Editor telaEditor = new Editor();

        // Congigurando o fundo do JProgressBar
        telaLoanding.progresso.setBackground(Color.cyan);
        telaLoanding.progresso.setForeground(Color.BLUE);

        // Tornando a tela de Loading  visível 
        telaLoanding.setVisible(true);

        // Animação do carregamento acontecer
        for (int i = 0; i <= 100; i++) {

            try {
                // Pausa em milisegundos
                Thread.sleep(50);

                // Preenchendo o meu JProgressBar
                telaLoanding.progresso.setValue(i);

                // Animação do Carregando..
                if (i % 2 == 0) {
                    telaLoanding.lblCarregando.setText("Carregando..");
                } else {
                    telaLoanding.lblCarregando.setText("Carregando...");
                }

            } catch (InterruptedException e) {

            }
        }
        
        telaLoanding.setVisible(false);
        telaEditor.setVisible(true);
    }
}
