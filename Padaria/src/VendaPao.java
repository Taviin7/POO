
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Otavio Lago
 * @since criada em 16/10/2025 Classe criada para
 */
public class VendaPao {

    public static void main(String[] args) {
        int qntd = 0;
        String Pao;
        boolean ponto, horas;

        Pao = JOptionPane.showInputDialog("Digite a quantidade de pão");
        int choicePonto = JOptionPane.showConfirmDialog(
                null, // Parent component (null for a centered dialog)
                "O pão está queimado?", // Message to display
                "Confirmation", // Title of the dialog
                JOptionPane.YES_NO_OPTION // Option type for Yes/No buttons
        );

        int choiceHoras = JOptionPane.showConfirmDialog(
                null, // Parent component (null for a centered dialog)
                "É antes das 18hrs?", // Message to display
                "Confirmation", // Title of the dialog
                JOptionPane.YES_NO_OPTION // Option type for Yes/No buttons
        );
        try {
            qntd = Integer.parseInt(Pao);

            if (choicePonto == JOptionPane.YES_OPTION) {
                ponto = true;
            } else {
                ponto = false;
            }
            if (choiceHoras == JOptionPane.YES_OPTION) {
                horas = true;
            } else {
                horas = false;
            }

            verificacao(qntd, ponto, horas);

        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números!!!");
        } catch (VendaExcecao e) {
            System.out.println("Ocorreu uma exceção do tipo: " + e.toString());
        } catch (Exception e) { //catch default, como no switch case
            System.out.println("Ocorreu uma exceção do tipo: " + e.toString());
        }
    }

    private static void verificacao(int qntd, boolean ponto, boolean horas) throws VendaExcecao {
        if (qntd > 50) {
            throw new VendaExcecao(qntd);
        }
        if (ponto == true) {
            throw new VendaExcecao(ponto);
        }
        if (horas == false) {
            throw new VendaExcecao("18");
        }
    }

}//fim da classe
