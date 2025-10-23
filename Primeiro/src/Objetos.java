/**
 * Classe criada para instanciar objetos do tipo pessoa
 * @author Otavio R. Lago
 * @since Classe criada em 04/09/2025
 */
public class Objetos {
    //assinatura do método main - só recebe String. []args é um vetor de Strings
    public static void main (String []args){
       // pessoa é a variável de referencia, da classe Pessoa, que vai referenciar a instância. Seria tipo o número de telefone da Pessoa
       Pessoa p1, p2;
       Analise analise = new Analise(); //inicializando
       
       //Instanciando os objetos para utilizar o GUI
       p1 = new Pessoa();
       p2 = new Pessoa();
       
       //p1 = new Pessoa("Otavio", 20, 1.80f, 54.5f); //f para formatar como float
       p1.exibirDadosPessoaGUI();
       System.out.println(analise.analisarIdadePessoa(p1)); //passando pessoa como parametro para a classe analisarIdadePessoa
       System.out.println(analise.analisarAlturaPessoa(p1));
       
       //p2 = new Pessoa("Marcos", 53, 1.69f, 80.5f); //f para formatar como float
       p2.exibirDadosPessoaGUI();
       System.out.println(analise.analisarIdadePessoa(p2)); 
       System.out.println(analise.analisarAlturaPessoa(p2));
       
       //passando 2 objetos para a classe
       System.out.println(analise.compararIdades(p1, p2));
    }//fim do main


}//fim da classe