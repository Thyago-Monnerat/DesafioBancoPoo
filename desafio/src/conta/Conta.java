package conta;

import banco.Banco;
import lombok.Getter;
import lombok.Setter;
import excecoes.LocalInvalidoException;
import excecoes.SaldoInvalidoException;
import excecoes.ValorAbaixoZero;

@Getter
@Setter
public abstract class Conta extends Banco{
    private int numero;
    private int digito;
    private String local;
    private double saldo;
    Banco banco = Banco.getInstancia();

    public Conta(int conta, int digito, String local) {
        this.numero = conta;
        this.digito = digito;
        this.local = local;
    }

    public void depositar(double valor) {
        if(valor < 0){
            throw new ValorAbaixoZero();
        }
        double valorDeposito = this.getSaldo();
        this.setSaldo(valorDeposito += valor);
    }

    public void sacar(double valor){
        if(this.getSaldo() < valor){
            throw new SaldoInvalidoException();
        }
        double valorSaque = this.getSaldo();
        this.setSaldo(valorSaque-valor);
    }

    public void setLocal(String local){
        switch (local) {
            case "EUR":
                this.setSaldo(this.getSaldo() * 6);
                break;
            case "EUA":
                this.setSaldo(this.getSaldo() * 5);
                break;
            default:
                throw new LocalInvalidoException();
        }
    }


    @Override
    public String toString() {
        return "\nConta= " + numero + "\nDigito= " + digito + "\nLocal= " + local + "\nSaldo=" + saldo + "\n";
    }   
}
