package wuz.gua.type;

public class GUndefine extends GuaObject {

    public static final GUndefine UNDEFINE = new GUndefine();

    public GUndefine() {
        super(GuaType.UNDEFINE);
    }

    @Override
    public String toString() {
        return "#<undefine>";
    }
}
