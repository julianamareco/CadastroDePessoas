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
public class CadastroPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long cpf = 1234;
        long CNPJ = 177777777;
        long natricula = 11111;
        
        ListaPessoas lista = new ListaPessoas();
        
        Pessoa pf = new PessoaFisica("Aline", 12345578);
        pf.setEndereco("Rua AAAAA, 70");
        pf.setDoc(cpf);
        lista.incluir(pf);
        
        Pessoa pj = new PessoaJuridica("UNIPAMPA", 12);
        pj.setDoc(CNPJ);
        lista.incluir(pj);
        
        Pessoa pa = new Aluno("cdf", 123123, natricula);
        lista.incluir(pa);
        
        System.out.println(lista.toString());
        
        lista.excluir(CNPJ);
        
        System.out.println(lista.toString());
        
    }
    
}
