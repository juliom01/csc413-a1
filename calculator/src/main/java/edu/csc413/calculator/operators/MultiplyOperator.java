package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import java.lang.Math;

public class MultiplyOperator extends  Operator{
    @Override
    public int precedence() {
        return 2;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        return new Operand((int) Math.pow(rhs.getValue(),lhs.getValue()));
    }
}
