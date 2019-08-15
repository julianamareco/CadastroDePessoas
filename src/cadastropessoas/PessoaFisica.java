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
public class PessoaFisica extends Pessoa{
    
    private long CPF, RG;
    private int idade;

    public PessoaFisica(String nome, long CPF){
        super(nome);
        this.CPF = CPF;
    }

    /**
     * @return the CPF
     */
    public long getDoc() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setDoc(long CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public long getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(long RG) {
        this.RG = RG;
    }
    
    
    @Override
    public String toString(){
        return super.toString() 
                + "\nCPF: " + CPF + "\nRG: "+RG+"\nIdade: "+getIdade();
    }

    
    public String getCabecalho(){
        return "##################################\n"
                + "Pessoa Fisica\n" 
                +"##################################\n";
    }
    
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
