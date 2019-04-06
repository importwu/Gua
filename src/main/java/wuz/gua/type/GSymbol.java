package wuz.gua.type;

public class GSymbol extends GuaObject {

    private String value;

    public GSymbol(String value) {
        super(GuaType.SYMBOL);
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
            GSymbol o = (GSymbol)other;
            if(o == this || value.equals(o.value)) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        return value;
    }
}
