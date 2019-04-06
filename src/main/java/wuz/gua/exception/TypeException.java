package wuz.gua.exception;

public class TypeException extends InterpreterException{

    public TypeException(String variable, String type) {
        super(variable + ": " + type);
    }
}
