
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Otavio Lago
 * @since classe criada em 18/09/2025 Classe criada para exibir um menu de
 * opções
 */
public class Menu {

    int opc;
    String msg;
    Figura figura;

    public Menu() {
        int a, b, c, d;
        
        msg = "1 - Ponto\n2 - Linha\n3 - Triângulo\n4 - Retângulo";
        msg = msg + "\n5 - Finalizar o Programa";
        boolean flag; //verificar op~çao inválida
        
        while (true) {
            flag = false;
            opc = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch (opc) {
                case 1:
                    System.out.println("\nConstruindo uma ponto");
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Ponto"));
                    figura = new Figura(a);
                    break;
                case 2:
                    System.out.println("\nContruindo uma linha");
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor da linha"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da linha"));
                    figura = new Figura(a, b);
                    break;
                case 3:
                    System.out.println("\nContruindo um triângulo");
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor do triângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da triângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da triângulo"));
                    figura = new Figura(a, b, c);
                    break;
                case 4:
                    System.out.println("\nContruindo um retângulo");
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor do retângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da retângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da retângulo"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor da retângulo"));
                    figura = new Figura(a, b, c, d);
                    break;
                case 5:
                    System.exit(0); //finaliza o programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null , "Opção INVÁLIDA", "Alerta", 2);
                    flag = true;
                    break;
            }//fim do switch22
            if (flag != true) {
                figura.exibirFigura();
            }
        }//fim do while
    }
}
