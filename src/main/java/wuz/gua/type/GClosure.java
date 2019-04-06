package wuz.gua.type;

import wuz.gua.interpreter.Environment;
import wuz.gua.interpreter.GuaAstVisitor;

import java.util.LinkedList;
import java.util.List;

public class GClosure extends GuaObject {

    private GProcedure procedure;
    private LinkedList<Environment> envs;

    public GClosure(GProcedure procedure, LinkedList<Environment> envs) {
        super(GuaType.CLOSURE);
        this.procedure = procedure;
        this.envs = envs;
    }

    public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
        LinkedList<Environment> save = visitor.getEnvironments();
        visitor.setEnvironments(envs);

        GuaObject ret = procedure.call(visitor, formals);

        visitor.setEnvironments(save);

        return ret;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GClosure o = (GClosure) other;
            if(o == this) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        return "#<closure>";
    }
}
