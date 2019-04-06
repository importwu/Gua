package wuz.gua.interpreter;

import wuz.gua.type.GuaObject;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    private Map<String, GuaObject> env = new HashMap<>();

    public void putVariable(String variable, GuaObject GObject) {
        env.put(variable, GObject);
    }

    public GuaObject getVariable(String variable) {
        return env.get(variable);
    }

    public void replaceVariable(String variable, GuaObject GObject) {
        env.replace(variable, GObject);
    }

    public Map<String, GuaObject> getEnvironment() {
        return env;
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<String, GuaObject> member: env.entrySet()) {
            builder.append(member.getKey())
                   .append(" => ")
                   .append(member.getValue());
        }
        return builder.toString();
    }
}
