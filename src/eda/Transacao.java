package eda;

public class Transacao {
    private int id;
    private OperacaoEnum operacao;
    private double valor;
    private int contaOrigem;
    private int contaDestino;
    private String data;
    private String responsavel;
    private ResponsavelEnum tipoResponsavel;
    
    public Transacao(int id, OperacaoEnum operacao, double valor, int contaOrigem, int contaDestino, String data, String responsavel, ResponsavelEnum tipoResponsavel){
        this.id = id;
        this.operacao = operacao;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = data;
        this.responsavel = responsavel;
        this.tipoResponsavel = tipoResponsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OperacaoEnum getOperacao() {
        return operacao;
    }

    public void setOperacao(OperacaoEnum operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public ResponsavelEnum getTipoResponsavel() {
        return tipoResponsavel;
    }

    public void setTipoResponsavel(ResponsavelEnum tipoResponsavel) {
        this.tipoResponsavel = tipoResponsavel;
    }
    
}
