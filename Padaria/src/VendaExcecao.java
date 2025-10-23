/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio Lago
 * @since criada em 16/10/2025 Classe criada para
 */
public class VendaExcecao extends Exception {

    public VendaExcecao(int qntd) {
        super("A quantidade de pão não pode ser maior que 50!!!");
    }

    VendaExcecao(boolean ponto) {
        super("O ponto do pão está queimado!!!");
    }

    VendaExcecao(String string) {
        super("A venda só ocorre antes das 18hrs!!!");
    }
}//fim da classe
