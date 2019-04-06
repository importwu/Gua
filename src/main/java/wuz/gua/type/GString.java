package wuz.gua.type;

public class GString extends GuaObject {

    private String value;

    public GString(String value) {
        super(GuaType.STRING);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GString o = (GString)other;
            if(o == this || value.equals(o.value)) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        return value;
    }
}
