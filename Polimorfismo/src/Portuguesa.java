/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para
 */
public class Portuguesa implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Margherita");
        System.out.println("Molho de tomate, mussarela, manjericão e azeite de oliva.");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 65,50");
    }

}//fim da classe
