package tratamento_excecoes.ex_02.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
