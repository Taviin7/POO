
/**
 *
 * @author Otavio Lago
 * @since criada em 06/11/2025 Classe criada para instanciar os objetos do tipo
 * Thread e propor o paralelismo
 */
public class Processo {

    public static void main(String[] args) {
        while (true) {
            Threads t1 = new Threads("ttvn");
            Threads t2 = new Threads("FATEC - SANTANA DE PARNAIBA");
            Threads t3 = new Threads("PEITIN GALEGO");
            Threads t4 = new Threads("MARRETADA DO THOR");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
}//fim da classe
