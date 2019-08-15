/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

import java.util.ArrayList;

/**
 *
 * @author Aline
 */
public class ListaPessoas {
    private ArrayList<Pessoa> pessoas;
    
    public ListaPessoas(){
        pessoas = new ArrayList();
    }
    
    public void incluir(Pessoa p){
        pessoas.add(p);
    }
    
    @Override
    public String toString(){
        String dados="";
        for(Pessoa p: pessoas){
            dados += p.getCabecalho() + p.toString() + "\n";
        }
        return dados;
    }
    
    public boolean excluir(long doc){
        for(Pessoa p: pessoas){
            if(p.getDoc()== doc){
                return pessoas.remove(p);
            }
        }
        return false;
    }
            
}
