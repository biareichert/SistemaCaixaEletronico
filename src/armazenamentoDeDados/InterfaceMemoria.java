package armazenamentoDeDados;

import eda.Funcionario;
import eda.Banco;
import eda.Conta;
import eda.Gerente;

public interface InterfaceMemoria {
    public Gerente getGerente(String login, String senha);
    public Funcionario getFuncionario(String login, String senha);
    public Conta getConta(int numCartao, int senha);
    public Banco getBanco(Conta c);
    public Banco getBanco(int numCartao);
    public int getLimiteOperacao();
    public boolean depositar(int numCartao, double valor);
    public boolean debitar(int numCartao, double valor);
    public Conta verificaContaSaldo(int numCartao);
    public Conta verificaContaGeral(int numConta);
    public Conta verificaContaDestino(int numConta);
    public boolean excluir(Conta conta, Banco banco);
}
