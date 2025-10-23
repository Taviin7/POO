/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 16/10/2025
 * Classe criada para tratar as execeções para classe Divisão
 */
public class DivisaoExcecao extends Exception{

    public DivisaoExcecao() {
        super("A não pode ser menor que B");
    }

    public DivisaoExcecao(int b) {
        super("O valor digitado para o b: " + b + " ,não pode ser superior a 500");
    }

    DivisaoExcecao(String a) {
        super("O número A NÃO pode ser número negativo");
    }
    
}//fim da classe
