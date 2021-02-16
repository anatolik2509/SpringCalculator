package ru.itis.antonov;

public class MinusOperation extends BinaryOperation{
    public MinusOperation(Operation operation1, Operation operation2) {
        super(operation1, operation2);
    }

    public MinusOperation() {
    }

    @Override
    public double getResult() {
        return operation1.getResult() - operation2.getResult();
    }

    @Override
    public Operation getClone() {
        return new MinusOperation();
    }
}
