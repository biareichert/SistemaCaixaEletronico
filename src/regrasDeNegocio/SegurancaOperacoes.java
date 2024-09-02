package regrasDeNegocio;

public class SegurancaOperacoes {
    
    static boolean atendeLimite(double valor){
        double limite = Negocio.MEM.getLimiteOperacao();
        return valor <= limite;
    }
}
