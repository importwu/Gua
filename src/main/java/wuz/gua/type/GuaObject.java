package wuz.gua.type;



public abstract class GuaObject {

    private int typeid;

    public GuaObject(int typeid) {
        this.typeid = typeid;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public  GBoolean eqv(GuaObject other) {
        return GBoolean.FALSE;
    }

}
