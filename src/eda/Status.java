package eda;

public class Status{
    public boolean erro;
    public String mensagem;
  
    public Status(){
        this.erro = false;
        this.mensagem = "";
    }
  
    public void addErro(String msg){
        this.mensagem += msg;
        this.erro = true;
    }
}
