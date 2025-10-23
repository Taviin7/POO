/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.associamentoveiculopessoa;

import javax.swing.JOptionPane;

/**
 * Classe criada para instanciar objetos do tipo Carro
 * @author Matheus Ferreira Gonçalves
 * @since Classe criada em 08/10/2025
 */
public class Veiculo {
   

    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;
    
    // Metodo construtor responsável por criar um objeto na memória
    // se voce nao declarar o construtor, quando voce compilar o codigo, dará um erro
    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
    

    // Constructor para entrada de dados com GUI
    public Veiculo(){
        
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor em reais(R$): "));
        
        
    }
 
    // Metodo para exibir os dados de Veiculo por meio de GUI
    public String exibirDadosVeiculoGUI(){
        
        String msg = "Marca: " + marca;
               msg = msg + "\nModelo: " + modelo + 
                           "\nAno de Fabricação: " + ano +
                           "\nValor em reais(R$): " + valor;
               
        return msg;
    }    
    
    // Metodo comum para exibir os dados de Veiculo
    public void exibirDadosVeiculo(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Valor em reais(R$): " + valor);
        
    }
    
    
} // fim da classe

