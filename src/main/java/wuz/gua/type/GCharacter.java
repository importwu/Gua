package wuz.gua.type;


public class GCharacter extends GuaObject {

    private char value;

    public GCharacter(char value) {
        super(GuaType.CHARACTER);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GCharacter o = (GCharacter)other;
            if(o.value == value) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        return "#\\" + value;
    }

}
