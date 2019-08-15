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
public class PessoaJuridica extends Pessoa{
    
    protected long CNPJ;
    protected String razaoSocial;
    
    public PessoaJuridica(String nome, long CNPJ){
        super(nome);
        this.CNPJ = CNPJ;
        razaoSocial = "";
    }

    /**
     * @return the CNPJ
     */
    public long getDoc() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setDoc(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nCNPJ: "+CNPJ+"\nRazao Social: "+razaoSocial;
    }
    
    public String getCabecalho(){
        return "##################################\n"
                + "Pessoa Juridica\n" 
                +"##################################\n";
    }
}
