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
public class Caprese implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Caprese");
        System.out.println("Tomates frescos, mussarela de búfala, manjericão e azeite");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 14 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 59,00");
    }

}//fim da classe
