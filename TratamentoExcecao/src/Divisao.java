
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Otavio Lago
 * @since criada em 16/10/2025\n Classe criada para demonstrar o recurso de
 * linguagem chamado TRATAMENTO DE EXCEÇÃO
 */
public class Divisao {

    public static void main(String[] args) {
        int a, b, divi = 0;
        String numA, numB;

        numA = JOptionPane.showInputDialog("Digite o valor de A:");
        numB = JOptionPane.showInputDialog("Digite o valor de B:");

        try {
            a = Integer.parseInt(numA);
            b = Integer.parseInt(numB);
            divi = dividir(a, b); //quando estiver em ITÁLICO, método estático
            
            System.out.println("Divisão: " + divi);

        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números!!!");
        } catch (ArithmeticException e) {
            System.out.println("Não existe divisão por zero(0)!!!");
        }
        catch(DivisaoExcecao e){ 
            System.out.println("Ocorreu uma exceção do tipo: " + e.toString());
        }
        catch (Exception e) { //catch default, como no switch case
            System.out.println("Ocorreu uma exceção do tipo: " + e.toString());
        }

    }//fim do main

    //as exceções seram direcionadas para a classe DivisaoExcecao
    private static int dividir(int a, int b) throws DivisaoExcecao {
        if(a < b)
            throw new DivisaoExcecao();
        if(b > 500)
            throw new DivisaoExcecao(b);
        if(a < 0)
            throw new DivisaoExcecao("www");
        return a / b;
    }
}//fim da classe
