package eda;

import java.util.ArrayList;

public class Banco {
    private String cnpj;
    private String nome;
    private ArrayList<Conta> conta;
    
    public Banco(String cnpj, String nome, ArrayList<Conta> conta){
        this.cnpj = cnpj;
        this.nome = nome;
        this.conta = conta;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }
    
}
