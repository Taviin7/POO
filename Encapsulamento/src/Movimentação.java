/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 02/10/2025
 * Classe criada para criar instâncias de ContaCorrente e testar o encapsulamento
 */
public class Movimentação {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Otavio", 200f, 1803, false
        );
        cc.Menu();
    }///fim do main
}//fim da classe
