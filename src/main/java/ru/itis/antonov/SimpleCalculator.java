package ru.itis.antonov;

import java.util.Map;

public class SimpleCalculator implements Calculator{

    private Map<Character, BinaryOperation> operations;

    public SimpleCalculator(Map<Character, BinaryOperation> operations) {
        this.operations = operations;
    }

    @Override
    public double calculate(String sentence) {
        return buildOperation(sentence.replaceAll(" ", "")).getResult();
    }

    private Operation buildOperation(String subSentence){
        int parentheses = 0;
        for (int i = 0; i < subSentence.length(); i++){
            if(subSentence.charAt(i) == '('){
                parentheses++;
            }
            if(subSentence.charAt(i) == ')'){
                parentheses--;
                if (parentheses < 0){
                    throw new IncorrectSyntaxException();
                }
            }
            if(operations.containsKey(subSentence.charAt(i)) && parentheses == 0){
                BinaryOperation operation = (BinaryOperation) operations.get(subSentence.charAt(i)).getClone();
                operation.setOperation1(buildOperation(subSentence.substring(0, i)));
                operation.setOperation2(buildOperation(subSentence.substring(i + 1)));
                return operation;
            }
        }
        if(parentheses > 0){
            throw new IncorrectSyntaxException();
        }
        if(subSentence.startsWith("(") && subSentence.endsWith(")")){
            return buildOperation(subSentence.substring(1, subSentence.length() - 1));
        }
        int num;
        try{
            num = Integer.parseInt(subSentence);
        } catch (NumberFormatException e){
            throw new IncorrectSyntaxException();
        }
        return new NumberContainOperation(num);
    }
}
