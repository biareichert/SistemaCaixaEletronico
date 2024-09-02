package eda;

public class PessoaFisica extends Cliente{
    private String cpf;
    private String sobrenome;
    
    public PessoaFisica(String nome, String telefone, Endereco endereco, String cpf, String sobrenome){
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
