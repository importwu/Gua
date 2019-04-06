package wuz.gua.type;

import java.util.ArrayList;

public class GVector extends GuaObject {

    private ArrayList<GuaObject> value;

    public GVector(ArrayList<GuaObject> value) {
        super(GuaType.VECTOR);
        this.value = value;
    }

    public ArrayList<GuaObject> getValue() {
        return value;
    }

    public void setValue(ArrayList<GuaObject> value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GVector o = (GVector)other;
            if(o == this || value.equals(o.value)) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        int size = value.size();
        StringBuilder builder = new StringBuilder();
        builder.append("#(");
        for(GuaObject GObject: value) {
            builder.append(GObject);
            if(--size != 0)
                builder.append(" ");
        }
        builder.append(")");
        return builder.toString();
    }
}
