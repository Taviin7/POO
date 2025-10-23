
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Classe criada para herdar TODOS atributos e métodos da superclasse Veículo
 *
 * @author Otavio Lago
 * @since Classe criada em 11/09/2025
 */
public class Carro extends Veiculo {

    int volPortaMalas;
    boolean conversivel;

    //Contrutor para um objeto do tipo carro em memória
    public Carro(String marca, String modelo, String cor, int ano, float valor, int volPortaMalas, boolean conversivel) {
        super(marca, modelo, cor, ano, valor);
        this.volPortaMalas = volPortaMalas;
        this.conversivel = conversivel;
    }

    //Método comum para xibir os dados de carro
    public void exibirDadosCarro() {
        super.exibirDadosVeiculo();
        System.out.println("Volume do porta-malas: " + volPortaMalas);
        System.out.println("É conversível: " + (conversivel ? "Sim" : "Não"));
    }

    //Construtor para entrada de dados com GUI
    public Carro() {
        this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do porta-malas: "));

        //Forma de fazer a verificação do conversível
        /*String resp = JOptionPane.showInputDialog("É conversível: ");
        
        if(resp.equals("Sim")|| resp.equals("sim"))
            this.conversivel = true;
        else
            this.conversivel = false;
         */
        //Forma melhor de fazer
        this.conversivel = JOptionPane.showInputDialog("Conversivel: ").equalsIgnoreCase("Sim");
    }

    //Método para exibir os dados por meio de GUI
    public void exibirDadosCarroGUI() {
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nValor do veículo: " + valor
                + "\nVolume do porta-malas: " + volPortaMalas
                + "\nConversível: " + (conversivel ? "Sim" : "Não");
        JOptionPane.showMessageDialog(null, msg, "Dados do Carro", -1);
    }
}
