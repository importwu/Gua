package wuz.gua.std;

import wuz.gua.exception.InterpreterException;
import wuz.gua.exception.TypeException;
import wuz.gua.generate.GuaParser;
import wuz.gua.interpreter.Environment;
import wuz.gua.interpreter.GuaAstVisitor;
import wuz.gua.type.*;

import java.util.LinkedList;
import java.util.List;

public class GuaStd {

    private static Environment env = new Environment();

    static {
        env.putVariable("+", new GProcedure("+", null, null) {
            @Override
            public GNumber call(GuaAstVisitor visitor, List<GuaObject> formals) {
                double acc = 0;
                for(GuaObject o: formals) {
                    acc += GuaType.convertToNumber(o).getValue();
                }
                return new GNumber(acc);
            }
        });

        env.putVariable("-", new GProcedure("-", null, null) {
            @Override
            public GNumber call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                double acc  = GuaType.convertToNumber(formals.get(0)).getValue();
                int given = formals.size();
                if(given == 1) return new GNumber(0 - acc);
                for(int i = 1; i < given; i++) {
                    acc -= GuaType.convertToNumber(formals.get(i)).getValue();
                }
                return new GNumber(acc);
            }
        });

        env.putVariable("*", new GProcedure("*", null, null) {
            @Override
            public GNumber call(GuaAstVisitor visitor, List<GuaObject> formals) {
                double acc = 1;
                for(GuaObject o: formals) {
                    acc *= GuaType.convertToNumber(o).getValue();
                }
                return new GNumber(acc);
            }
        });

        env.putVariable("/", new GProcedure("/", null, null) {
            @Override
            public GNumber call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                double acc =  GuaType.convertToNumber(formals.get(0)).getValue();
                int given = formals.size();
                if(given == 1) return new GNumber(1 / acc);
                for(int i = 1; i < given; i++) {
                    acc /= GuaType.convertToNumber(formals.get(i)).getValue();
                }
                return new GNumber(acc);
            }
        });

        env.putVariable("=", new GProcedure("=", null, null) {
            @Override
            public GBoolean call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                int given = formals.size();
                if(given == 1) return GBoolean.TRUE;
                for(int i = 0; i < given; i++) {
                    if(i != given - 1) {
                        double numL = GuaType.convertToNumber(formals.get(i)).getValue();
                        double numR = GuaType.convertToNumber(formals.get(i + 1)).getValue();
                        if(numL == numR) return GBoolean.TRUE;
                    }
                }
                return GBoolean.FALSE;
            }
        });

        env.putVariable(">", new GProcedure(">", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                int given = formals.size();
                if(given == 1) return GBoolean.TRUE;
                for(int i = 0; i < given; i++) {
                    if(i != given - 1) {
                        double numL = GuaType.convertToNumber(formals.get(i)).getValue();
                        double numR = GuaType.convertToNumber(formals.get(i + 1)).getValue();
                        if(numL > numR) return GBoolean.TRUE;
                    }
                }
                return GBoolean.FALSE;
            }
        });

        env.putVariable(">=", new GProcedure(">=", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                int given = formals.size();
                if(given == 1) return GBoolean.TRUE;
                for(int i = 0; i < given; i++) {
                    if(i != given - 1) {
                        double numL = GuaType.convertToNumber(formals.get(i)).getValue();
                        double numR = GuaType.convertToNumber(formals.get(i + 1)).getValue();
                        if(numL >= numR) return GBoolean.TRUE;
                    }
                }
                return GBoolean.FALSE;
            }
        });

        env.putVariable("<", new GProcedure("<", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                int given = formals.size();
                if(given == 1) return GBoolean.TRUE;
                for(int i = 0; i < given; i++) {
                    if(i != given - 1) {
                        double numL = GuaType.convertToNumber(formals.get(i)).getValue();
                        double numR = GuaType.convertToNumber(formals.get(i + 1)).getValue();
                        if(numL < numR) return GBoolean.TRUE;
                    }
                }
                return GBoolean.FALSE;
            }
        });

        env.putVariable("<=", new GProcedure("<=", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                leastArity(formals, 1);
                int given = formals.size();
                if(given == 1) return GBoolean.TRUE;
                for(int i = 0; i < given; i++) {
                    if(i != given - 1) {
                        double numL = GuaType.convertToNumber(formals.get(i)).getValue();
                        double numR = GuaType.convertToNumber(formals.get(i + 1)).getValue();
                        if(numL <= numR) return GBoolean.TRUE;
                    }
                }
                return GBoolean.FALSE;
            }
        });

        env.putVariable("null", new GList(GuaType.LIST, new LinkedList<>()));

        env.putVariable("null?", new GProcedure("null?", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GBoolean ret = GBoolean.FALSE;
                GuaObject GObject = formals.get(0);
                if(GuaType.isList(GObject)) {
                    GList list = GuaType.convertToList(GObject);
                    if(list.getValue().isEmpty()) {
                        ret = GBoolean.TRUE;
                    }
                }
                return ret;
            }
        });

        env.putVariable("pair?", new GProcedure("list?", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GBoolean ret = GBoolean.FALSE;
                GuaObject GObject = formals.get(0);
                System.out.println(GObject.getTypeid());
                if(GuaType.isPair(GObject) || GuaType.isImproper(GObject)) {
                    ret = GBoolean.TRUE;
                }
                return ret;
            }
        });

        env.putVariable("list?", new GProcedure("list?", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GBoolean ret = GBoolean.FALSE;
                GuaObject GObject = formals.get(0);
                if(GuaType.isList(GObject) || GuaType.isImproper(GObject)) {
                    ret = GBoolean.TRUE;
                }
                return ret;
            }
        });

        env.putVariable("car", new GProcedure("car", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GuaObject GObject = formals.get(0);
                if(GuaType.isList(GObject) || GuaType.isPair(GObject) || GuaType.isImproper(GObject)) {
                    LinkedList<GuaObject> list = GuaType.convertToList(GObject).getValue();
                    if(list.isEmpty()) {
                        throw new InterpreterException("is a pair?");
                    }
                    return list.getFirst();
                }
                throw new TypeException(formals.get(0).toString(), "not a pair");
            }
        });

        env.putVariable("cdr", new GProcedure("cdr", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GuaObject GObject = formals.get(0);
                if(GuaType.isList(GObject) || GuaType.isPair(GObject) || GuaType.isImproper(GObject)) {
                    LinkedList<GuaObject> list = GuaType.convertToList(GObject).getValue();
                    if(list.isEmpty()) {
                        throw new InterpreterException("is a pair?");
                    }
                    if(list.size() == 2) {
                        return list.getLast();
                    }
                    LinkedList<GuaObject> ret = new LinkedList<>(list);
                    ret.removeFirst();
                    return new GList(GObject.getTypeid(), ret);
                }
                throw new TypeException(formals.get(0).toString(), "not a pair");
            }
        });

        env.putVariable("cons", new GProcedure("cons", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 2);
                GuaObject GObject1 = formals.get(0);
                GuaObject GObject2 = formals.get(1);
                LinkedList<GuaObject> value = new LinkedList<>();
                if(GuaType.isList(GObject2) || GuaType.isPair(GObject2) || GuaType.isImproper(GObject2)) {
                    GList list = GuaType.convertToList(GObject2);
                    value.addAll(list.getValue());
                    value.addFirst(GObject1);
                    return new GList(GuaType.LIST, value);
                }else {
                    value.add(GObject1);
                    value.add(GObject2);
                    return new GList(GuaType.PAIR, value);
                }
            }
        });

        env.putVariable("list", new GProcedure("list", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                LinkedList<GuaObject> value = new LinkedList<>(formals);
                return new GList(GuaType.LIST, value);
            }
        });

        env.putVariable("print", new GProcedure("print", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                return new GString(formals.get(0).toString());
            }
        });

        env.putVariable("force", new GProcedure("force", null, null) {
            @Override
            public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
                fixedArity(formals, 1);
                GPromise promise = GuaType.convertToPromise(formals.get(0));
                GuaObject ret = GUndefine.UNDEFINE;
                LinkedList<Environment> save = visitor.getEnvironments();
                visitor.setEnvironments(promise.getEnvironments());
                for(GuaParser.ExpressionContext expr: promise.getValue()) {
                    ret = visitor.visit(expr);
                }
                visitor.setEnvironments(save);
                return ret;
            }
        });
    }


    public static Environment getEnvironment() {
        return env;
    }
}
