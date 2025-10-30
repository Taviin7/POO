/**
 *
 * @author Otavio Lago
 * @since criada em 30/10/2025
 * Classe criada para implementar TODOS os métodos da interface Pizza
 */
public class RomeuJulieta implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Romeu e Julieta");
        System.out.println("Queijo, Goiabada, Leite Condensado, Leite Ninho");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 5 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$ 60,00");
    }
    
    public void adicionarIngrediente(){
        System.out.println("Informar o que deseja a mais na pizza");
    }

}//fim da classe
