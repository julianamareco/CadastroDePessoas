package cadastropessoas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    
    public Pessoa(String nome){
        this.nome = nome;
        this.endereco = "";
        this.telefone = "";
        this.email = "";
    }
    
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = "";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return ("Nome: "+ nome+" \nEndereco: "+endereco+"\nTelefone: " 
                + getTelefone()+"\nE-mail: "+getEmail());
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public long getDoc(){return 0;}
    public void setDoc(long doc){};
    
    public String getCabecalho(){
        return "##################################\n"
                + "Pessoa\n" 
                +"##################################\n";
    }
    
}
