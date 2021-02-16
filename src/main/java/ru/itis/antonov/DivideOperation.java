package ru.itis.antonov;

public class DivideOperation extends BinaryOperation{
    public DivideOperation(Operation operation1, Operation operation2) {
        super(operation1, operation2);
    }

    public DivideOperation() {
    }

    @Override
    public double getResult() {
        return operation1.getResult() / operation2.getResult();
    }

    @Override
    public Operation getClone() {
        return new DivideOperation();
    }
}
