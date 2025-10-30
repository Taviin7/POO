/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para implementar TODOS os métodos da interface Pizza
 */
public class Calabresa implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Calabresa");
        System.out.println("Calabresa, Molho de Tomate, Cebola, Azeitonas Pretas");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 45,00");
    }

}//fim da classe
