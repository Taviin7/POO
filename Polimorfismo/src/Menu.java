
import javax.swing.JOptionPane;

/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025 Classe criada para apresentar um menu de opções
 * ao cliente com os diversos sabores de pizza e o pão
 */
public class Menu {

    Pizza pizza; //não precisa instanciar pois é interface
    Forno forno = new Forno();
    String mensagem;

    public Menu() {
        while (true) {
            int opc = 0;

            mensagem = "1- Frango com Catupiry";
            mensagem = mensagem + "\n2- Calabresa";
            mensagem = mensagem + "\n3- Caprese";
            mensagem = mensagem + "\n4- Cinco Queijos";
            mensagem = mensagem + "\n5- Napolitana";
            mensagem = mensagem + "\n6- Portuguesa";
            mensagem = mensagem + "\n7- Romana";
            mensagem = mensagem + "\n8- Romeu e Julieta";
            mensagem = mensagem + "\n9- Pão";
            mensagem = mensagem + "\n0- Sair";

            opc = Integer.parseInt(JOptionPane.showInputDialog(mensagem));

            switch (opc) {
                case 1:
                    pizza = new FrangoCatupiry();
                    break;
                case 2:
                    pizza = new Calabresa();
                    break;
                case 3:
                    pizza = new Caprese();
                    break;
                case 4:
                    pizza = new CincoQueijos();
                    break;
                case 5:
                    pizza = new Napolitana();
                    break;
                case 6:
                    pizza = new Portuguesa();
                    break;
                case 7:
                    pizza = new Romana();
                    break;
                case 8:
                    pizza = new RomeuJulieta();
                    break;
                case 9:
                    pizza = new PaoCaseiro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!!!");

            }//fim do switch
            forno.preparar(pizza);
        }
        //Objeto polimófico

    }//fim do construtor

}//fim da classe
