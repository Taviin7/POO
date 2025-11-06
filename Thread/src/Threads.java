
import javax.swing.JOptionPane;


/**
 *
 * @author Otavio Lago
 * @since criada em 06/11/2025 Classe criada para gerar Threads que executam uma
 * determinada tarefa
 */
public class Threads extends Thread {
    int sleeptime;

    public Threads(String nome) {
        super(nome);
        sleeptime = (int) (Math.random() * 500);
        System.out.println("A Thread " + getName() + " vai dormir por " + sleeptime + " ms");
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(sleeptime);
        } catch (InterruptedException ex){
            System.out.println("A Thread " + getName() + " foi interrompida!!!");
        }
        System.err.println("A Thread " + getName() + " --------> ACORDOU!!!");
        JOptionPane.showMessageDialog(null, "Travando");
        JOptionPane.showMessageDialog(null, "Travando");
        JOptionPane.showMessageDialog(null, "Travando");
        JOptionPane.showMessageDialog(null, "Travando");
        JOptionPane.showMessageDialog(null, "Travando");
    }
}//fim da classe
