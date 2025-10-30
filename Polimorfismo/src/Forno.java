
/**
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para gerar o objeto polimorfico
 * FORNO que irá preparar todo e qualquer tipo de PIZZA
 */
public class Forno {
    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
}//fim da classe
