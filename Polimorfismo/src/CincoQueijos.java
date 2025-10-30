/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para implementar TODOS os métodos da interface Pizza
 */
public class CincoQueijos implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Cinco Queijos");
        System.out.println("Mussarela, Provolone, Gorgonzola, Parmesão, "
                + "Catupiry, Molho de Tomate, Orégano");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 70,00");
    }

}//fim da classe
