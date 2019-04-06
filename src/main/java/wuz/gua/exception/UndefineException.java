package wuz.gua.exception;

public class UndefineException extends InterpreterException {

    public UndefineException(String variable) {
        super(variable + ": undefined;");
    }
}
