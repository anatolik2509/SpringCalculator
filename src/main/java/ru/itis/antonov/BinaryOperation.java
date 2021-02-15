package ru.itis.antonov;

public abstract class BinaryOperation implements Operation{
    protected Operation operation1;
    protected Operation operation2;

    public BinaryOperation(Operation operation1, Operation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    public BinaryOperation() {
    }

    public Operation getOperation1() {
        return operation1;
    }

    public void setOperation1(Operation operation1) {
        this.operation1 = operation1;
    }

    public Operation getOperation2() {
        return operation2;
    }

    public void setOperation2(Operation operation2) {
        this.operation2 = operation2;
    }
}
