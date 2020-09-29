package edu.csc413.calculator.operators;
import edu.csc413.calculator.evaluator.Operand;
public class DivideOperator extends Operator {
    @Override
        public int precedence() {
            return 3;
        }
    @Override
        public Operand execute(Operand opd1, Operand opd2) {
            return (new Operand(opd1.getValue() / opd2.getValue()));
        }
    }
}
