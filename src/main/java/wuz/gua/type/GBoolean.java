package wuz.gua.type;


public class GBoolean extends GuaObject {

    public static final GBoolean TRUE = new GBoolean(true);
    public static final GBoolean FALSE = new GBoolean(false);

    private boolean value;

    public GBoolean(boolean value) {
        super(GuaType.BOOLEAN);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        return this;
    }


    @Override
    public String toString() {
        return "#" + (value ? "t" : "f");
    }
}
