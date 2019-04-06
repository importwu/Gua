package wuz.gua.type;

public class GVoid extends GuaObject {

    public static final GVoid VOID = new GVoid();

    public GVoid() {
        super(GuaType.VOID);
    }

    @Override
    public String toString() {
        return "#<void>";
    }
}
