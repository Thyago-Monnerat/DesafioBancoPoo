package conta;

import java.util.List;

import banco.Banco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta extends Banco{
    private int numero;
    private int digito;
    private String local;
    private double saldo;
    private List<Conta> extrato;
    
    public Conta(int conta, int digito, String local) {
        this.numero = conta;
        this.digito = digito;
        this.local = local;
    }

    @Override
    public String toString() {
        return "\nConta= " + numero + "\nDigito= " + digito + "\nLocal= " + local + "\nSaldo=" + saldo;
    }   
}
