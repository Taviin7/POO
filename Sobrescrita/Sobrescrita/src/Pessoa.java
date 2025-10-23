
/**
 * @author Otavio Lago
 * @since classe criada em 25/09/2025 Classe criada para demonstrar o recurso de
 * sobrescrita de métodos
 */
public class Pessoa {

    protected String nome; //protegido dentro da estrutura de herança
    int idade;
    float altura;

    //Construtor do objeto Pessoa em memória
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Método para exibir os dados da Pessoa
    public void exibirDados() {
        System.out.println("Nome da pessoa: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
    }
}//fim da classe
