package jdbc.ex_00_4.db;

public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
