
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Otavio Lago
 * @since 18/09/2025
 * Classe criada para demonstrar o método de sobrecarga 
 */
public class Figura {
    
    Integer a, b, c, d; //Integer para testar se o objeto é null. Se fosse int, não daria certo

    //Contrutor para um Ponto
    Figura(int a) {
        this.a = a;
    }
    
    //Contrutor para uma Linha
    Figura(int a, int b){ //Sobrecarga
        this.a = a;
        this.b = b;
    }
    
    //Contrutor para um Triângulo
    Figura(int a, int b, int c){ //Sobrecarga
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
     //Contrutor para uma Retângulo
    Figura(int a, int b, int c, int d){ //Sobrecarga
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    //Método genérico para exibir QUALQUER TIPO DE FIGURA
    public void exibirFigura(){
        if(a != null  && b == null && c == null && d == null)
            exibirFigura(1);
        else if (a != null  && b != null && c == null && d == null)
            exibirFigura("linha");
        else if(a != null  && b != null && c != null && d == null)
            exibirFigura(true);
        else
            exibirFigura(1.8f);
    }
    //Método comum para exibir os dados do Ponto
    public void exibirFigura(int marretada){ 
        JOptionPane.showMessageDialog(null ,"É um ponto de valor: " + a, "Ponto", 1);
    }
    
    //Método comum para exibir os dados de uma Linha
    public void exibirFigura(String thor){ //usado só para diferenciar do outro método - Sobrecarga
        JOptionPane.showMessageDialog(null ,"É uma linha de coordernadas: " + a + " e " + b, "Linha", 1);
    }
    
    //Método comum para exibir os dados de um Triângulo
    public void exibirFigura(boolean peitin){ //usado só para diferenciar do outro método - Sobrecarga
        JOptionPane.showMessageDialog(null, "É um triângulo com valores: " + a + ", " + b + " e " + c, "Triângulo", 1);
    }
    
    //Método comum para exibir os dados de um Retângulo
    public void exibirFigura(float galego){ //usado só para diferenciar do outro método - Sobrecarga
        JOptionPane.showMessageDialog(null, "É um retângulo cuja coordenadas são: " + a + ", " + b + ", " + c + " e " + d, "Retângulo", 1);
    }
}
