package conta;

public class Poupanca extends Conta{
    private double saldoPoupanca;

    public Poupanca(int conta, int digito, String local) {
        super( conta,  digito, local);
    }

    @Override
    public String toString() {
        return super.toString() + "Poupanca= " + saldoPoupanca;
    }

    
}
