/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para implementar TODOS os métodos da interface Pizza
 */
public class FrangoCatupiry implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Frango com Catupiry");
        System.out.println("molho de tomate, frango, catupiry e azeitona verdes");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 55,00");
    }

}//fim da classe