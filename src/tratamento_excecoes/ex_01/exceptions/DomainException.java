package tratamento_excecoes.ex_01.exceptions;

public class DomainException extends RuntimeException {

    public DomainException(String msg) {
        super(msg);
    }
}
