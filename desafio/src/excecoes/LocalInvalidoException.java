package excecoes;

public class LocalInvalidoException extends RuntimeException{
    public LocalInvalidoException() {
        super("Localização inválida! \n Localizações disponíveis:\nBR\nEUR\nEUA");
    }
}


