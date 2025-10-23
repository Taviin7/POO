/**
 * Classe criada para analisar um objeto do tipo Pessoa
 * @author Otavio R. Lago
 * @since Classe criada em 04/09/2025
 */
public class Analise {
       
    //Método comum para analisar uma pessoa
    public String analisarIdadePessoa(Pessoa p){ //Pessoa é o tipo do dado - p é o parametro. Porém, p está recebendo o objeto Otavio
        if(p.idade < 2)
            return "Bebê";
        else if(p.idade < 13)
            return "Criança";
        else if(p.idade < 20)
            return "Adolescente";
        else if(p.idade < 60)
            return "Adulto";
        else if(p.idade <= 85)
            return "Idoso";
        else
            return "Bico do Urubu";
    }
    
    public String analisarAlturaPessoa(Pessoa p){
        if(p.altura < 1.50)
            return "Anã";
        else if(p.altura < 1.60)
            return "Muito Baixo";
        else if(p.altura < 1.70)
            return "Baixo";
        else if(p.altura < 1.75)
            return "Normal";
        else if(p.altura < 1.80)
            return "Alta";
        else
            return "Muito Alto";
    }
    
    //Método para comparar a idade de duas pessoas
    public String compararIdades(Pessoa p1, Pessoa p2){
        if(p1.idade == p2.idade)
            return p1.nome + " tem a mesma idade que " + p2.nome;
        else if(p1.idade > p2.idade)
             return p1.nome + " é mais velho(a) que " + p1.nome;
        else
            return p1.nome + " é mais novo(a) que " + p2.nome;
    }
}//fim da classe
