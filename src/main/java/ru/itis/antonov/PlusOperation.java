package ru.itis.antonov;

public class PlusOperation extends BinaryOperation{

    public PlusOperation(Operation operation1, Operation operation2) {
        super(operation1, operation2);
    }

    public PlusOperation(){

    }

    @Override
    public double getResult() {
        return operation1.getResult() + operation2.getResult();
    }

    @Override
    public Operation getClone() {
        return new PlusOperation();
    }
}
