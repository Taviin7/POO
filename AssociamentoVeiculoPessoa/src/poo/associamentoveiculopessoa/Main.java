/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.associamentoveiculopessoa;

/**
 *
 * @author 2830482411033
 */
public class Main {
    
    public static void main(String args[]){
        
        Pessoa p = new Pessoa("Rasmusen II", 12, 1.70f);
        Carro c1 = new Carro();
       
        p.comprarCarro(c1);
        
    }
    
}
