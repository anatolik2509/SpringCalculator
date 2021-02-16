package ru.itis.antonov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClassStart {
    private Calculator calculator;
    private SentenceInput sentenceInput;
    private ResultOutput resultOutput;


    public static void main(String[] args) {
        new ClassStart();
    }

    public ClassStart(){
        ApplicationContext context =
                new FileSystemXmlApplicationContext(getClass().getResource("/componentScan.xml").toString());
        calculator = (Calculator) context.getBean("calculator");
        sentenceInput = (SentenceInput) context.getBean("input");
        resultOutput = (ResultOutput) context.getBean("output");
        while (true){
            String s = sentenceInput.getSentence();
            if(s.equals("exit")){
                break;
            }
            try {
                resultOutput.printResult(calculator.calculate(s) + "");
            }catch (IncorrectSyntaxException e){
                resultOutput.printResult("Syntax error");
            }
        }
    }
}
