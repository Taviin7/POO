
/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025 
 * Classe criada para instanciar um objeto do tipo
 * PaoCaseiro para ser preparado pelo objeto polimófico Forno
 */
public class PaoCaseiro implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pão Caseiro");
        System.out.println("Farinha, Leite, Ovos, Fermento, Sal, Acúçar, Óleo");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 40 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 12,00");
    }

}//fim da classe
