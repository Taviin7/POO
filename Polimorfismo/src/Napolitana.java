/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para
 */
public class Napolitana implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Napolitana");
        System.out.println("Molho de tomate, mussarela de búfala, anchovas e orégano");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 13 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 67,50");
    }

}//fim da classe
