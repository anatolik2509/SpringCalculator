package ru.itis.antonov;

public class ConsoleResultOutput implements ResultOutput{
    @Override
    public void printResult(String result) {
        System.out.println(result);
    }
}
