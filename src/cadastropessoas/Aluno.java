/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastropessoas;

/**
 *
 * @author Aline
 */
public class Aluno extends PessoaFisica{
    
    private long matricula;
    
    public Aluno(String nome, long CPF, long matricula){
        super(nome, CPF);
        this.matricula = matricula;
        
    }

    /**
     * @return the matricula
     */
    public long getDoc() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setDoc(long matricula) {
        this.matricula = matricula;
    }
    
    public String toString(){
        return super.toString() + "\nMatricula: "+matricula;
    }
    
    public String getCabecalho(){
        return "##################################\n"
                + "Aluno\n" 
                +"##################################\n";
    }
    
}
