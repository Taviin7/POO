
/**
 * Classe criada para instaciar objetos do tipo Produto e Venda
 *
 * @author Otavio Lago
 * @since criada em 27/11/2025
 *
 */
public class Supermercado {

    public static void main(String[] args) {
        Produto p1, p2, p3, p4, p5;
        Venda v1, v2;

        //Produto disponíveis para compra (instâncias/objetos)
        p1 = new Produto(10, "Vassoura", 23f);
        p2 = new Produto(15, "Arroz", 7.83f);
        p3 = new Produto(25, "Detergente", 1.75f);
        p4 = new Produto(45, "Esponja", 1.25f);
        p5 = new Produto(18, "Feijão", 4.92f);

        //Instâncias de Vendas
        v1 = new Venda(101, "Carlos Alberto");
        v2 = new Venda(205, "Camila Souza");

        v1.adicionarProduto(p1);
        v1.adicionarProduto(p2);
        v1.adicionarProduto(p3);

        v2.adicionarProduto(p4);
        v2.adicionarProduto(p3);
        v2.adicionarProduto(p5);

        //Listagem de produtos da venda 1
        System.out.println("===============================");
        System.out.println("Cliente: " +v1.cliente);
        System.out.println("===============================");
        v1.listarProdutos();
        //v1.indicesProdutos();
        //System.out.println("===============================");
        v1.totalizarVenda();
        v1.removerItemProduto(p1);
        v1.listarProdutos();
        v1.totalizarVenda();
        //System.out.println("===============================");
        
        //Listagem de produtos da venda 2
        System.out.println("===============================");
        System.out.println("Cliente: " +v2.cliente);
        System.out.println("===============================");
        v2.listarProdutos();
        //v2.indicesProdutos();
        System.out.println("===============================");
        v2.totalizarVenda();
        System.out.println("===============================");
    }
}//fim da classe
