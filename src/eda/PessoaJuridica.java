package eda;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    
    public PessoaJuridica(String nome, String telefone, Endereco endereco,String cnpj){
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
