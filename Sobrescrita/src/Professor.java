
/**
 * @author Otavio Lago
 * @since classe criada em 25/09/2025 
 * Classe criada para demonstrar o recurso de sobrescrita de métodos
 */
public class Professor extends Pessoa {

    int codigo;
    String disciplina;
    float salario;

    //Construtor do objeto Professor em memória
    public Professor(String nome, int idade, float altura, int codigo, String disciplina, float salario) {
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override //Sobrescrita da classe Pessoa
    public void exibirDados() {
        System.out.println("O professor " + nome + " ministra a disciplina " + disciplina
                + " e tem o salário de R$" + salario);
    }

    //Sobrecarga de método de cima
    public void exibirDados(boolean resp) {
        super.exibirDados();
        System.out.println("Salário: " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Código de funcionário: " + codigo);
    }

    //Sobrecarga de método de cima
    public void exibirDados(int x) {
        System.out.println("Professor " + nome);
        System.out.println("Salário " + salario);
    }

}//fim da classe
