package conta;

public class Poupanca extends Conta{
    private double saldoPoupanca;

    public Poupanca(int conta, int digito, String local) {
        super( conta,  digito, local);

        saldoPoupanca = 3;
        super.setSaldo(super.getSaldo() * saldoPoupanca);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRendimento Poupança=" + saldoPoupanca;
    }  

    
}
