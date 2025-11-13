
/**
 * Classe criada para exibir diversos frames contínuos na tela
 *
 * @author Otavio Lago
 * @since criada em 13/11/2025
 *
 */
public class Virus {

    public static void main(String[] args) {
        int x = 0;
        while (x < 50) {
            Janela j1, j2, j3, j4;
            j1 = new Janela();
            j2 = new Janela();
            j3 = new Janela();
            j4 = new Janela();

            j1.start();
            j2.start();
            j3.start();
            j4.start();
            x++;
        }
    }
}//fim da classe
