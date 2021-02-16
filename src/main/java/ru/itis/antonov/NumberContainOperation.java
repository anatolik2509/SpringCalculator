package ru.itis.antonov;

public class NumberContainOperation implements Operation{
    private double number;

    public NumberContainOperation(double number) {
        this.number = number;
    }

    @Override
    public double getResult() {
        return number;
    }

    public NumberContainOperation() {
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public Operation getClone() {
        return new NumberContainOperation();
    }
}
