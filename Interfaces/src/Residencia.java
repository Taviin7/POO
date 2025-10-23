/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 23/10/2025
 * Classe criada para instanciar objetos do tipo Eletrodoméstico e testar
 * suas funcionalidades
 */
public class Residencia {
    public static void main(String[] args) throws InterruptedException {
        /*
        TV tv = new TV("LG", 65.5f, false);
        tv.ligar();
        tv.desligar(10);
        */
        Microondas microondas = new Microondas("LG", 500, 13.5f, false);
        //microondas.ligar();
        //microondas.timer(10);
        //microondas.pipoca();
        //microondas.adicionar30seg();
        microondas.ligar(15);
    }//fim do main
}//fim da classe
