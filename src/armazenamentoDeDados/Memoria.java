package armazenamentoDeDados;

import eda.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Memoria implements InterfaceMemoria{
    static Memoria instancia = null;
    int limiteOperacao = 600;
    Gerente gerente = new Gerente("000000000", "Joao", "Castella", "adm", "1234");
    ArrayList<PessoaFisica> fisica = new ArrayList();
    ArrayList<PessoaJuridica> juridica = new ArrayList();
    ArrayList<Funcionario> func = new ArrayList();
    ArrayList<Banco> banco = new ArrayList();
    ArrayList<Conta> conta = new ArrayList();
    ArrayList<Conta> conta1 = new ArrayList();
    ArrayList<Estado> estado = new ArrayList();
    ArrayList<Pais> pais = new ArrayList();
    ArrayList<Cidade> cidade = new ArrayList();
    ArrayList<Endereco> endereco = new ArrayList();
    ArrayList<Cliente> cliente = new ArrayList();
    ArrayList<Cartao> cartao = new ArrayList();
    ArrayList<Transacao> transacao = new ArrayList();
    ArrayList<Transacao> transacao1 = new ArrayList();
    ArrayList<Transacao> transacao2 = new ArrayList();
    ArrayList<Conta> contaGeral = new ArrayList();
    
    private Memoria(){
        init();
    }
  
    private void init(){
        Funcionario funcy = new Funcionario("159236745", "Bruna", "Souza", "bruna", "1234");
        Banco bank = new Banco("1234", "Itau", this.conta);
        Banco bank1 = new Banco("4321", "Santander", this.conta1);
        Pais country = new Pais(100, "Brasil");
        Estado states = new Estado(102, "Santa_Catarina", country);
        Cidade city = new Cidade(204, "Joinville", states, country);
        Endereco end = new Endereco(89, "Augusto_Schwarz", "89255820", 45, "Casa", city, "Amizade");
        Endereco ende = new Endereco(80, "Schwarz", "526355", 45, "Casa",city,"Bom_Retiro");
        PessoaFisica pf = new PessoaFisica("Renato", "33701229", end, "09615847933", "Garcia");
        PessoaFisica pf1 = new PessoaFisica("Bianca", "33701229", ende, "09615847933", "Lima");
        PessoaFisica pf2 = new PessoaFisica("Juliana", "33711852", ende, "09615847933", "Silva");
        PessoaJuridica pj = new PessoaJuridica("TecnoSol", "33711885", end, "85621430");
        Cartao card = new Cartao(12345, 452, "10/2024", 123,pf);
        Cartao card1 = new Cartao(54321, 452, "10/2024", 123,pf1);
        Cartao card2 = new Cartao(123, 452, "10/2024", 123,pf2);
        Conta cont = new Conta(card,ContaEnum.CORRENTE, 1500.0, 303,3030, transacao);
        Conta cnt = new Conta( card1,ContaEnum.CORRENTE, 1000.0, 202,2020, transacao1);
        Conta cnt2 = new Conta( card2,ContaEnum.CORRENTE, 2000.0, 101, 1010, transacao2);
      
        fisica.add(pf);
        fisica.add(pf2);
        fisica.add(pf1);
        juridica.add(pj);
        cliente.add(pf);
        cliente.add(pf2);
        cliente.add(pf1);
        cliente.add(pj);
        func.add(funcy);
        banco.add(bank);
        banco.add(bank1);
        estado.add(states);
        pais.add(country);
        cidade.add(city);
        endereco.add(end);
        endereco.add(ende);
        cartao.add(card);
        cartao.add(card2);
        cartao.add(card1);
        conta.add(cont);
        conta1.add(cnt);
        conta1.add(cnt2);
        contaGeral.add(cont);
        contaGeral.add(cnt);
        contaGeral.add(cnt2);
    }
    
    public static Memoria getInstance(){
        if (instancia == null) {
            instancia = new Memoria();
        }
        return instancia;
    }
  
    @Override
    public Gerente getGerente(String login, String senha){
        if ((this.gerente.getLogin().equals(login)) && (this.gerente.getSenha().equals(senha))) {
            return this.gerente;
        }
        return null;
    }
  
    @Override
    public Funcionario getFuncionario(String login, String senha){
        for (Funcionario fc : func) {
            if ((fc.getLogin().equals(login)) && (fc.getSenha().equals(senha))) {
                return fc;
            }
        }
        return null;
    }
 
    @Override
    public Conta getConta(int numeroCartao, int senha){
        for(Conta cn : contaGeral){
            if(cn.getCartao().getNumero() == numeroCartao && cn.getSenha() == senha){
                return cn;
            }
        }
        return  null;
    }
    
   
  
    @Override
    public Banco getBanco(Conta conta){
        for (Banco b : this.banco) {
            if (b.getConta().contains(conta)) {
                return b;
            }
        }
        return null;
    }
    
    @Override
     public Banco getBanco(int numCartao){
        Conta cnt = null;
        for(Conta c : contaGeral){
            if(c.getCartao().getNumero() == numCartao){
                cnt = c;
            }
        }
        for (Banco b : banco) {
            if (b.getConta().contains(cnt)) {
                return b;
            }
        }
        return null;
    }
  
    @Override
    public int getLimiteOperacao(){
        return this.limiteOperacao;
    }
  
    @Override
    public boolean depositar(int numCartao, double valor){
        Iterator<Conta> it = contaGeral.iterator();
        while (it.hasNext()){
            Conta aux = (Conta)it.next();
            if (aux.getCartao().getNumero() == numCartao){
                double saldo = aux.getSaldo();
                saldo += valor;
                aux.setSaldo(saldo);
                return true;
            }
        }
        return false;
    }
  
    @Override
    public boolean debitar(int numCartao, double valor){
        return depositar(numCartao, -valor);
    }
  
    @Override
    public Conta verificaContaSaldo(int numCartao){
        for (Conta cn : contaGeral) {
            if (cn.getCartao().getNumero() == numCartao) {
                return cn;
            }
        }
        return null;
  }
  
    @Override
    public Conta verificaContaGeral(int numConta){
        for (Conta c : contaGeral) {
            if (c.getNumConta() == numConta){
                Conta cont = verificaContaSaldo(numConta);
                return cont;
            }
        }
        return null;
    }
    
    @Override
    public Conta verificaContaDestino(int numConta){
        for(Conta cn : contaGeral){
            if(cn.getNumConta() == numConta){
                return cn;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(Conta conta, Banco b) {
        for(Conta cn : contaGeral){
            if(cn.equals(conta)){
                contaGeral.remove(conta);
                return true;
            }
        }
     
        return false;
    }
    

}  
    