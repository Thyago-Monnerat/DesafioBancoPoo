package excecoes;

public class ValorAbaixoZero extends RuntimeException {
    public ValorAbaixoZero() {
        super("Insira um valor maior que 0 para continuar!");
    }
}