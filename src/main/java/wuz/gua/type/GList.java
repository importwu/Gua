package wuz.gua.type;

import java.util.LinkedList;

public class GList extends GuaObject {

    private LinkedList<GuaObject> value;

    public GList(int typeid, LinkedList<GuaObject> value) {
        super(typeid);
        this.value = value;
    }

    public LinkedList<GuaObject> getValue() {
        return value;
    }

    public void setValue(LinkedList<GuaObject> value) {
        this.value = value;
    }


    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GList o = (GList)other;
            if(o == this || value.equals(o.value)) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        int size = value.size();
        StringBuilder builder = new StringBuilder();
        builder.append("(");

        for(int i = 0; i < size; i++) {
            switch (getTypeid()) {
                case GuaType.LIST:
                case GuaType.IMPROPER:
                    builder.append(value.get(i));
                    if(i != size - 1) builder.append(" ");
                    break;
                case GuaType.PAIR:
                    builder.append(value.get(i));
                    if(size - (i + 1) != 0) builder.append(" ");
                    if(size - (i + 1) == 1) builder.append(".").append(" ");
                    break;
            }
        }
        builder.append(")");
        return builder.toString();
    }
}
