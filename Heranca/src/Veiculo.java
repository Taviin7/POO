
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Classe criada para desmonstrar o principio da herança entre classes
 *
 * @author Otavio Lago
 * @since Classe criada em 11/09/2025
 */
public class Veiculo {

    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;

    //Construtor responsável por criar um objeto na memória
    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        //EM VERDE ATRIBUTO DA CLASSE e em preto paramêtro
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    //Método comum para exibir os dados de Veículo. Void pois vai printar os dados
    public void exibirDadosVeiculo() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Valor em reais: " + valor);
    }

    //Construtor para entrada de dados com GUI
    public Veiculo() {
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do veículo: "));
    }

    //Método para exibir os dados por GUI
    public void exibirDadosVeiculoGUI() {
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nValor do veículo: " + valor;
        JOptionPane.showMessageDialog(null, msg, "Dados do Veículo", -1);
    }
}//fim da classe
