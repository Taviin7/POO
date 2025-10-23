
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Otavio Lago
 * @since criada em 23/10/2025 Classe criada para gerar objeto do tipo
 * Microondas que implementam TODOS os métodos da interface Eletrodoméstico
 */
public class Microondas implements Eletrodomestico {

    String marca;
    int potencia;
    float litros;
    boolean ligado;

    public Microondas(String marca, int potencia, float litros, boolean ligado) {
        this.marca = marca;
        this.potencia = potencia;
        this.litros = litros;
        this.ligado = ligado;
    }

    //métodos da interface
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O microondas " + marca + " está ligado!!!");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Piiiiiiiiiiiiii - microondas desligado!!!");
    }

    //métodos da classe
    public void ligar(int tempo) throws InterruptedException {
        while (tempo > 0) {
            System.out.println(tempo);
            Thread.sleep(1000); //1 segundo
            tempo--;
        }
        beeps(15);
    }

    public void beeps(int tempo) throws InterruptedException {
        while (tempo > 0) {
            System.out.println(tempo);
            Thread.sleep(1000); //1 segundo
            Toolkit.getDefaultToolkit().beep(); //beep

            tempo--;
        }
    }

    public void pipoca() throws InterruptedException {
        ligar(300);
        desligar();
    }

    public void adicionar30seg() throws InterruptedException {
        ligar(30);
        desligar();
    }
}//fim da classe
