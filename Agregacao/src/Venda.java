
import java.util.ArrayList;

/**
 * Classe criada para gerar objetos do tipo Venda
 * @author Otavio Lago
 * @since criada em 27/11/2025
 *
 */
public class Venda {
    int codigo;
    String cliente;
    ArrayList<Produto> Itens = new ArrayList();

    public Venda(int codigo, String cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }
    
    //Método que relaciona o produto comprado com a venda
    public void adicionarProduto(Produto p){
        Itens.add(p);
        System.out.println("Item adicionado à venda!");
    }
    
    //Exibir todo o conteudo dos produtos comprados pelo cliente
    public void listarProdutos(){
        
        System.out.println("Lista de produtos vendidos\n");
        for( Produto x : Itens){ //pega a variavel X, do tipo Produto, na lista Itens
            //x.exibirProduto();
            System.out.println("Nome: "+x.nome);
            System.out.println("Valor: "+x.valor);
        }
    }
    
    //Indices dos produtos dentro do array
    public void indicesProdutos(){
            System.out.println("Produto:" + Itens);
    }
    
    //Método para totalizar o total da compra
    public void totalizarVenda(){
        float total = 0;
        for( Produto x : Itens){
            total += x.valor;
        }
        System.out.println("Valor total: R$" + total);
    }
    
    //Método para remover um produto da lista de itens
    public void removerItemProduto(Produto p){
        Itens.remove(p);
        System.err.println("Item removido: " + p.nome);
    }
}//fim da classe
