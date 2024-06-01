package conta;

import java.util.stream.Collector;

import cliente.Cliente;
import excecoes.SaldoInvalidoException;
import servicos.GeradorNumeroRandom;

public class Corrente  extends Conta{
    private double chequeEsp;

    public Corrente(int conta, int digito, String local) {
        super( conta,  digito, local);
        this.chequeEsp = new GeradorNumeroRandom().gerador(3);
    }

    public void transferir(double valor, Cliente idDestino){
        double saldo = super.getSaldo();
        if(saldo < valor){
            throw new SaldoInvalidoException();
        }
        super.setSaldo(saldo - valor);

        double saldoDestino = idDestino.getConta().getSaldo(); 
        idDestino.getConta().setSaldo(saldoDestino + valor);

    }

    @Override
    public String toString() {
        return super.toString() + "\nCheque Especial= " + chequeEsp;
    }   

    
}
