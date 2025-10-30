/**
 * Interface para servir de padrão para todo e qualquer tipo de pizza
 * Possui as funcionalidedas de "montar", "assar" e "cobrar"
 * @author 2830482411045
 */
public interface Pizza {
    
    //método de montar a pizza com os ingredientes
    public void montar();
    
    //método para o tempo que a pizza ficara no forno
    public void assar();
    
    //método para cobrar o valor de acordo com o sabor
    public void cobrar();
}
