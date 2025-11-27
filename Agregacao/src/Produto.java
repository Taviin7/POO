
/**
 * Classe criada para gerar objetos do tipo Produto
 *
 * @author Otavio Lago
 * @since criada em 27/11/2025
 *
 */
public class Produto {

    int codigo;
    String nome;
    float valor;

    public Produto(int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo + "\nProduto: " + nome + "\nPreço: " + valor);
    }
}//fim da classe
