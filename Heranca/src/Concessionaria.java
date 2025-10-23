/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Carro
 * @author Otavio Lago
 * @since 11/09/2025
 */
public class Concessionaria {
    public static void main(String[] args) {
        //carro é a variável de referencia, que referencia a MERCEDES
        Carro carro = new Carro("Mercedes", "CLA250", "Preto", 2026, (float)345000, 250, false);
        //carro.exibirDadosCarro();
        
        Carro car = new Carro();
        car.exibirDadosCarroGUI();
        
        
        //caminhao é a variável de referencia, que referencia o VOLVO
        //Caminhao caminhao = new Caminhao("Volvo", "FH", "Prata", 2026, (float)875000, "Cabine", (float)4000000, 3);
        //caminhao.exibirDadosCaminhao();
        
        //Caminhao cam = new Caminhao();
        //cam.exibirDadosCaminhao();
    }
}
