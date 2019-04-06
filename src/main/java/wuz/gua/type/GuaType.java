package wuz.gua.type;

import wuz.gua.exception.TypeException;

public interface GuaType {
    int BOOLEAN      = 0;
    int NUMBER       = 1;
    int CHARACTER    = 2;
    int STRING       = 3;
    int SYMBOL       = 6;
    int LIST         = 7;
    int PAIR         = 8;
    int IMPROPER     = 9;
    int VECTOR       = 10;
    int MAP          = 11;
    int PROCEDURE    = 12;
    int PROMISE      = 14;
    int UNDEFINE     = 15;
    int VOID         = 16;
    int CLOSURE      = 17;

    static boolean isBoolen(GuaObject other) {
        return BOOLEAN == other.getTypeid();
    }

    static boolean isNumber(GuaObject other) {
        return NUMBER == other.getTypeid();
    }

    static boolean isCharacter(GuaObject other) {
        return CHARACTER == other.getTypeid();
    }

    static boolean isString(GuaObject other) {
        return STRING == other.getTypeid();
    }

    static boolean isSymbol(GuaObject other) {
        return SYMBOL == other.getTypeid();
    }

    static boolean isList(GuaObject other) {
        return LIST == other.getTypeid();
    }

    static boolean isPair(GuaObject other) {
        return PAIR == other.getTypeid();
    }

    static boolean isImproper(GuaObject other) {
        return IMPROPER == other.getTypeid();
    }

    static boolean isVector(GuaObject other) {
        return VECTOR == other.getTypeid();
    }

    static boolean isMap(GuaObject other) {
        return MAP == other.getTypeid();
    }

    static boolean isProcedure(GuaObject other) {
        return PROCEDURE == other.getTypeid();
    }

    static boolean isPromise(GuaObject other) {
        return PROMISE == other.getTypeid();
    }

    static boolean isUndefine(GuaObject other) {
        return UNDEFINE == other.getTypeid();
    }

    static boolean isVoid(GuaObject other) {
        return VOID == other.getTypeid();
    }

    static boolean isClosure(GuaObject other) {
        return CLOSURE == other.getTypeid();
    }


    static GBoolean convertToBoolean(GuaObject o) {
        if(!GuaType.isBoolen(o)) throw new TypeException(o.toString(), "not a boolean");
        return (GBoolean)o;
    }

    static GCharacter convertToCharacter(GuaObject o) {
        if(!GuaType.isCharacter(o)) throw new TypeException(o.toString(), "not a character");
        return (GCharacter) o;
    }

    static GClosure convertToClosure(GuaObject o) {
        if(!GuaType.isClosure(o)) throw new TypeException(o.toString(), "not a closure");
        return (GClosure) o;
    }

    static GList convertToList(GuaObject o) {
        if(!GuaType.isList(o) && !GuaType.isPair(o) && !GuaType.isImproper(o)) throw new TypeException(o.toString(), "not a list");
        return (GList) o;
    }

    static GMap convertToMap(GuaObject o) {
        if(!GuaType.isMap(o)) throw new TypeException(o.toString(), "not a map");
        return (GMap) o;
    }

    static GNumber convertToNumber(GuaObject o) {
        if(!GuaType.isNumber(o)) throw new TypeException(o.toString(), "not a number");
        return (GNumber) o;
    }

    static GProcedure convertToProcedure(GuaObject o) {
        if(!GuaType.isProcedure(o)) throw new TypeException(o.toString(), "not a procedure");
        return (GProcedure) o;
    }

    static GPromise convertToPromise(GuaObject o) {
        if(!GuaType.isPromise(o)) throw new TypeException(o.toString(), "not a promise");
        return (GPromise) o;
    }

    static GString convertToString(GuaObject o) {
        if(!GuaType.isString(o)) throw new TypeException(o.toString(), "not a string");
        return (GString) o;
    }

    static GSymbol convertToSymbol(GuaObject o) {
        if(!GuaType.isSymbol(o)) throw new TypeException(o.toString(), "not a symbol");
        return (GSymbol) o;
    }

    static GUndefine convertToUndefine(GuaObject o) {
        if(!GuaType.isUndefine(o)) throw new TypeException(o.toString(), "not a undefine");
        return (GUndefine) o;
    }

    static GVector convertToVector(GuaObject o) {
        if(!GuaType.isVector(o)) throw new TypeException(o.toString(), "not a vector");
        return (GVector) o;
    }

    static GVoid convertToVoid(GuaObject o) {
        if(!GuaType.isVoid(o)) throw new TypeException(o.toString(), "not a void");
        return (GVoid) o;
    }
}


















