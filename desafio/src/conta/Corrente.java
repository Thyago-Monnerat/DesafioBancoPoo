package conta;

import cliente.Cliente;
import excecoes.SaldoInvalidoException;
import servicos.GeradorNumeroRandom;

public class Corrente  extends Conta{
    private double chequeEsp;

    public Corrente(int conta, int digito, String local) {
        super( conta,  digito, local);
        this.chequeEsp = new GeradorNumeroRandom().gerador(3);
    }


    @Override
    public String toString() {
        return super.toString() + "Cheque especial= " + chequeEsp;
    }

    
    public void transferir(double valor, Cliente idDestino){
        double saldo = super.getSaldo();
        if(saldo < valor){
            throw new SaldoInvalidoException();
        }
        super.setSaldo(saldo - valor);

        double saldoDestino = banco.getListaContas().get(idDestino).getSaldo(); 
        banco.getListaContas().get(idDestino).setSaldo(saldoDestino + valor);

    }   
}
