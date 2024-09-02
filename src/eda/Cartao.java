package eda;

public class Cartao {
    private int numero;
    private int codSeguranca;
    private String dataValidade;
    private int agencia;
    private Cliente cliente;
    
    public Cartao(int numero, int codSeguranca, String dataValidade, int agencia, Cliente cliente){
        this.numero = numero;
        this.codSeguranca = codSeguranca;
        this.dataValidade = dataValidade;
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
