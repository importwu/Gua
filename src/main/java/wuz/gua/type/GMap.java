package wuz.gua.type;

import java.util.HashMap;
import java.util.Map;

public class GMap extends GuaObject {

    private HashMap<GuaObject, GuaObject> value;

    public GMap(HashMap<GuaObject, GuaObject> value) {
        super(GuaType.MAP);
        this.value = value;
    }

    public HashMap<GuaObject, GuaObject> getValue() {
        return value;
    }

    public void setValue(HashMap<GuaObject, GuaObject> value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GMap o = (GMap)other;
            if(o == this || value.equals(o.value)) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        int remain = value.size();
        StringBuilder builder = new StringBuilder();
        builder.append("#hash(");
        for(Map.Entry<GuaObject, GuaObject> member: value.entrySet()) {
            builder.append("(")
                    .append(member.getKey())
                    .append(" ")
                    .append(".")
                    .append(" ")
                    .append(member.getValue())
                    .append(")");
            if(--remain != 0) builder.append(" ");
        }
        builder.append(")");
        return builder.toString();
    }
}
