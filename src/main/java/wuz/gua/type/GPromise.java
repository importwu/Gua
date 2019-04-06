package wuz.gua.type;

import wuz.gua.generate.GuaParser;
import wuz.gua.interpreter.Environment;

import java.util.LinkedList;
import java.util.List;

public class GPromise extends GuaObject {

    private List<GuaParser.ExpressionContext> value;
    private LinkedList<Environment> envs;

    public GPromise(List<GuaParser.ExpressionContext> value, LinkedList<Environment> envs) {
        super(GuaType.PROMISE);
        this.value = value;
        this.envs =  envs;
    }

    public List<GuaParser.ExpressionContext> getValue() {
        return value;
    }

    public void setValue(List<GuaParser.ExpressionContext> value) {
        this.value = value;
    }

    public LinkedList<Environment> getEnvironments() {
        return envs;
    }

    public void setEnvironments(LinkedList<Environment> envs) {
        this.envs = envs;
    }

    @Override
    public String toString() {
        return "#<promise>";
    }
}
