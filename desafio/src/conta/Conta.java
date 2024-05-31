package conta;

import cliente.Cliente;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Conta {
    private String banco;
    private int numero;
    private int digito;
    private String local;
    private double saldo;
    private Cliente cliente;
    
    public Conta(String banco, int numero, int digito, String local, Cliente cliente) {
        this.banco = banco;
        this.numero = numero;
        this.digito = digito;
        this.local = local;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nBanco= " + banco + "\nConta= " + numero + "\nDigito= " + digito + "\nLocal= " + local + "\nSaldo=" + saldo + "\nCliente="
                + cliente;
    }   
    
    
}
