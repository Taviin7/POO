/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.associamentoveiculopessoa;

/**
 * Classe criada para instanciar objetos do tipo Carro
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 08/10/2025
 */
public class Pessoa {
    
    String nome;
    int idade;
    float altura;
    Carro carro;
    
    // Construtor do objeto Pessoa em memória
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    // Metodo para exibir os dados de Pessoa
    public void exibirDados(){
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    
    // Metodo comum para comprar Carro
    public void comprarCarro(Carro c1){
        
        this.carro = c1; // Associa Carro com Pessoa
        //teste
        System.out.println("A pessoa  " + nome + " comprou o carro " + carro.modelo);

    }
}
