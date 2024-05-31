package excecoes;

public class MenorIdadeException extends RuntimeException {
    public MenorIdadeException() {
        super("Data de nascimento inválida. Usuários com menos de 18 anos não podem criar contas");
    }
}