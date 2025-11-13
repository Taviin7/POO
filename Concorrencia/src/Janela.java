
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Otavio Lago
 * @since criada em 13/11/2025 
 * Classe criada para
 */
public class Janela extends Thread{

    JFrame frame = new JFrame();
    JPanel panel;
    JTextField texto = new JTextField();
    int sleeptime, x, y;
    
    public Janela(){
            panel = new JPanel() {
            Image bg = new ImageIcon(getClass().getResource("/macaco-ouvindo-musica-macaco.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        };
            
        sleeptime = (int)(Math.random() * 5000);
        x = (int)(Math.random() * 1220);
        y = (int)(Math.random() * 680);
        float r, g, b;

        texto.setText("Você foi invadido pelo little syzn");
        texto.setFont(new Font("Arial", Font.BOLD, 30));
        
        panel.add(texto);
        /* Gerando cores randomicamente
        r = (float) (Math.random() * 150);
        g = (float) (Math.random() * 450);
        b = (float) (Math.random() * 100);
        //painel.setBackground(new Color(Color.HSBtoRGB((float)Math.random(), (float)Math.random(), (float)Math.random())));
        painel.setBackground(new Color(Color.HSBtoRGB(r,g, b)));
        */
        
        //colocando imagens

        frame.setSize(550, 450); //ajusta o tamanho X(largura) e Y(altura) do frame
        frame.setLocation(x, y); //coordenadas do frame
        frame.add(panel);
        frame.setVisible(true);
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(sleeptime);
            //frame.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//fim da classe
