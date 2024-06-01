package excecoes;

public class SaldoInvalidoException extends RuntimeException{
    public SaldoInvalidoException() {
        super("Saldo insuficiente para completar a transação");
    }
}
