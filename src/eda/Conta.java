package eda;

import java.util.ArrayList;

public class Conta {
    private Cartao cartao;
    private ContaEnum tipo;
    private double saldo;
    private int senha;
    private int numConta;
    private ArrayList<Transacao> transacao;
    
    public Conta(Cartao cartao, ContaEnum tipo, double saldo, int senha, int numConta, ArrayList<Transacao> transacao){
        this.cartao = cartao;
        this.tipo = tipo;
        this.saldo = saldo;
        this.senha = senha;
        this.numConta = numConta;
        this.transacao = transacao;
                
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public ContaEnum getTipo() {
        return tipo;
    }

    public void setTipo(ContaEnum tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public ArrayList<Transacao> getTransacao() {
        return transacao;
    }

    public void setTransacao(ArrayList<Transacao> transacao) {
        this.transacao = transacao;
    }
    
}
