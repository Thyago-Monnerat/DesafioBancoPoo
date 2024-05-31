package conta;

public class Corrente  extends Conta{
    private double chequeEsp;

    public Corrente(int conta, int digito, String local) {
        super( conta,  digito, local);
    }

    @Override
    public String toString() {
        return super.toString() + "Cheque especial= " + chequeEsp;
    }

    
}
