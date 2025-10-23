
import javax.swing.JOptionPane;

/**
 * Classe criada para...
 * @author Otavio R. Lago
 * @since Classe criada em 04/09/2025
 */
public class Pessoa {
    String nome; //escrito com s maisculo pois se trata de uma classe
    int idade;
    float altura;
    float peso;
    
    //Método contrutor do objeto em memória, tem q ter o mesmo nome da classe
    public Pessoa(String nome, int idade , float altura, float peso){
        //ao colocar this o parametro nome recebe o atributo nome
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Método ocnstrutor para entrada de dados por meio de GUI
    public Pessoa(){
        this.nome = JOptionPane.showInputDialog("Nome da pessoa: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade da pessoa: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Altura da pessoa: "));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog("Peso da pessoa: "));
    }
    
    //Método comum para exibir os dados de uma pessoa
    public void exibirDadosPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + calcularIMC() + " - " + classificarIMC());
    }
    
    //Método comum para exibir os dados de uma pessoa por meio de GUI
    public void exibirDadosPessoaGUI(){
        String msg;
        
        //Montando uma mensagem para exibir na caixa de dialogo
        msg = "Nome " + this.nome;
        msg = msg + "\nIdade: " + this.idade;
        msg = msg + "\nAltura: " + this.altura;
        msg = msg + "\nPeso: " + this.peso;
        msg = msg + "\nIMC: " + calcularIMC() + " - " + classificarIMC();
        
        JOptionPane.showMessageDialog(null, msg, "Dados Pessoas", -1);
    }
    
    //Método comum para calcular o IMC de uma Pessoa
    public float calcularIMC(){
        return peso / (altura * altura);
    }
    
    //Método comum para classificar o IMC
    public String classificarIMC(){
        float imc = calcularIMC();
        if(imc < 16.0)
            return "Muito abaixo do peso";
        else if(imc < 18.0)
            return "Magro";
        else if(imc < 25.0)
            return "Peso normal";
        else if(imc < 30.0)
            return "Sobrepeso";
        else if(imc < 35.0)
            return "Obesidade Tipo 1 - Leve";
        else if(imc < 40.0)
            return "Obesidade Tipo 2 - Severa";
        else
            return "Obesidade Tipo 3 - Mórbida";
                    
    }

}//fim da classe