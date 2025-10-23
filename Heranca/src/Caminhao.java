
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2830482411045
 */
public class Caminhao extends Veiculo {

    String carroceria;
    float tara;
    int eixos;

    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos) {
        super(marca, modelo, cor, ano, valor);
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
    }

    public void exibirDadosCaminhao() {
        super.exibirDadosVeiculo();
        System.out.println("Tipo da carroceria: " + carroceria);
        System.out.println("Tara: " + tara);
        System.out.println("Qntd. Eixos: " + eixos);
    }

    //Construtor para entrada de dados com GUI
    public Caminhao() {
        this.carroceria = JOptionPane.showInputDialog("Tipo da carroceria: ");
        this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara Máxima: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Qntd. de eixos: "));
    }

    //Método para exibir os dados por meio de GUI
    public void exibirDadosCaminhaoGUI() {
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nAno de fabricação: " + ano
                + "\nValor do veículo: " + valor
                + "\nTipo de carroceria: " + carroceria
                + "\nTara máxima: " + tara
                + "\nQntd. eixos: " + eixos;
        JOptionPane.showMessageDialog(null, msg, "Dados do Caminhão", -1);
    }
}
