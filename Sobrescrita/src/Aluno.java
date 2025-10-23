
/**
 *
 * @author Otavio Lago
 * @since criada em 25/09/2025 Classe criada para fafafa
 */
public class Aluno extends Pessoa {

    int RA;
    float media;
    int faltas;
    boolean dependencia;

    public Aluno(String nome, int idade, float altura, int RA, float media, int faltas, boolean dependencia) {
        super(nome, idade, altura);
        this.RA = RA;
        this.media = media;
        this.faltas = faltas;
        this.dependencia = dependencia;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("RA: " + RA);
        System.out.println("Média: " + media);
        System.out.println("Faltas: " + faltas);
        System.out.println("Possui dependência: " + (dependencia ? "SIM" : "NÃO"));
    }

    public void exibirDados(int x) {
        System.out.println("Nome: " + nome);
        System.out.println("Faltas: " + faltas);
        System.out.println("Média: " + media);
    }

    public void exibirDados(int x, int z) {
        System.out.println("Possui dependência: " + (dependencia ? "SIM" : "NÃO"));
    }

}//fim da classe
