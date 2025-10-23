/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 23/10/2025 Classe criada para instanciar objetos do tipo TV
 * que implementaram a TODOS os métodos da interface ELETRODOMÉSTICO
 */
public class TV implements Eletrodomestico {

    String marca;
    float polegada;
    boolean ligado;

    //construtor do objeto TV
    public TV(String marca, float polegada, boolean ligado) {
        this.marca = marca;
        this.polegada = polegada;
        this.ligado = ligado;
    }

    //métodos da interface
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("A TV foi ligada!!!");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("A TV foi desligada!!!");
    }

    //função sleeptime
    public void desligar(int timer) throws InterruptedException {
        System.out.println("Timer ajustado para " + timer + " segundos");
        while (timer > 0) {
            System.out.println(timer);
            Thread.sleep(1000); //1 segundo
            timer--;
        }
        desligar();
    }

}//fim da classe
