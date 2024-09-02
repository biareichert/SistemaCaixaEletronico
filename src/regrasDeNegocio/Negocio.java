package regrasDeNegocio;

import eda.Funcionario;
import eda.Status;
import eda.Banco;
import eda.Conta;
import eda.Gerente;
import armazenamentoDeDados.InterfaceMemoria;
import armazenamentoDeDados.Memoria;

public class Negocio {
    static InterfaceMemoria MEM = Memoria.getInstance();
    
    public static Gerente validarGerente(String login, String senha){
        Gerente gerente = MEM.getGerente(login, senha);
        return gerente;
    }
  
    public static Funcionario validarFuncionario(String login, String senha){
        Funcionario funcionario = MEM.getFuncionario(login, senha);
        return funcionario;
    }
  
    public static Conta validarConta(int numeroCartao, int senha){
        Conta conta = MEM.getConta(numeroCartao, senha);
        return conta;
    }
  
    public static Conta validarContaGeral(int numeroConta){
        Conta conta = MEM.verificaContaGeral(numeroConta);
        if (conta != null) {
            return conta;
        }
        return null;
    }
    public static Conta verificaContaDestino(int numConta){
        Conta conta = MEM.verificaContaDestino(numConta);
        if(conta != null){
            return conta;
        }
        return null;
    }
  
    public static Conta verificaConta(int numCartao){
        Conta conta = MEM.verificaContaSaldo(numCartao);
        return conta;
    }
  
    public static Banco validarBanco(Conta conta){
        Banco banco = MEM.getBanco(conta);
        return banco;
    }
  
    public static Status sacar(int numCartao, double valor){
        Status status = new Status();
    
        boolean res = SegurancaOperacoes.atendeLimite(valor);
        if (!res){
            status.addErro("Valor excede o limite por operação!");
            return status;
        }
        res = possuiSaldo(numCartao, valor);
        if (!res){
            status.addErro("Cliente não possui saldo!");
            return status;
        }
        boolean retorno = MEM.debitar(numCartao, valor);
        if (!retorno) {
            status.addErro("A conta não existe");
        }
        return status;
    }
  
    public static Status pagar(int numCartao, double valor){
        Status status = new Status();
        boolean res = possuiSaldo(numCartao, valor);
        if (!res){
            status.addErro("Cliente não possui saldo!");
            return status;
        }
        boolean retorno = MEM.debitar(numCartao, valor);
        if (!retorno) {
            status.addErro("A conta não existe");
        }
        return status;
    }
    
  
    static boolean possuiSaldo(int numCartao, double valor){
        Conta conta = MEM.verificaContaSaldo(numCartao);
        if (conta == null) {
            return false;
        }
        if (conta.getSaldo() < valor) {
            return false;
        }
        return true;
    }
  
    public static Status depositar(int numCartao, double valor){
        boolean retorno = MEM.depositar(numCartao, valor);
        Status status = new Status();
        if (!retorno) {
            status.addErro("A conta não existe");
        }
        return status;
    }
    
    public static boolean excluir(int numCartao){
        Conta conta = MEM.verificaContaSaldo(numCartao);
        Banco banco = MEM.getBanco(numCartao);
        if(conta != null){
            boolean t = MEM.excluir(conta,banco);
            if(t){
                return true;
            }
        }
        return false;
    }  
    
}
