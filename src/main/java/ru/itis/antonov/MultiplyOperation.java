package ru.itis.antonov;

public class MultiplyOperation extends BinaryOperation{
    public MultiplyOperation(Operation operation1, Operation operation2) {
        super(operation1, operation2);
    }

    public MultiplyOperation() {
    }

    @Override
    public double getResult() {
        return operation1.getResult() * operation2.getResult();
    }
}
