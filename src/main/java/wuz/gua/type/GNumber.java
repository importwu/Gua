package wuz.gua.type;

import wuz.gua.exception.TypeException;

public class GNumber extends GuaObject {
    private double value;

    public GNumber(double value) {
        super(GuaType.NUMBER);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GNumber o = (GNumber)other;
            if(o.value == this.value) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        char[] chars = String.valueOf(value).toCharArray();
        int count = chars.length;
        if(chars[count - 1] == '0' && chars[count - 2] == '.') { count -= 2; }
        return String.valueOf(chars, 0, count);
    }
}
