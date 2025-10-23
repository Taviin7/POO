
/**
 *
 * @author Otavio Lago
 * @since Classe criada para instanciar objetos do tipo Pessoa e Professor
 */
public class Cadastro {

    public static void main(String args[]) {
        //Pessoa p = new Pessoa("Manuela", 23, 1.65f);
        Professor prof = new Professor("Tetsuo", 54, 1.74f, 9899, "Matemática Discreta", 7500f);
        prof.exibirDados();
        //prof.salario = 9500f; Quando não há um paramêtro de visibilidade, há uma prostituição da informação, ou seja, qualquer um pode alterar
        //prof.exibirDados(); Método da sobrescrita
        //prof.exibirDados(2); //Método da sobrecarga
        //Aluno a = new Aluno("Otavio", 20, 1.8f, 11045, 8, 0, false);
        //a.exibirDados(11045 , 8);
    }

}//fim da classe
