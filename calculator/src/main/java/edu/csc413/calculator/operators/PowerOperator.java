package edu.csc413.calculator.operators;

public class PowerOperator {

    int priority() {
        return 3;
    }

    Operand execute(Operand opd1, Operand opd2) {
        Operand temp = new Operand(opd1.getValue() * opd2.getValue());
        return temp;
    }
}
}
