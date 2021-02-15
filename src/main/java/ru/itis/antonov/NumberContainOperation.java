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
}
