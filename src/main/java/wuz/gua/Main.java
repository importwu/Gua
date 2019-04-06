package wuz.gua;

import wuz.gua.interpreter.GuaEvaluator;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        GuaEvaluator evaluator = new GuaEvaluator(Optional.ofNullable(
                args.length == 1 ? args[0] : null
        ));
        evaluator.eval();
    }
}
