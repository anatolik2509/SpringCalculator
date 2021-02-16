package ru.itis.antonov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SpringConfig {
    @Bean
    public BinaryOperation plusOp(){
        return new PlusOperation();
    }

    @Bean
    public BinaryOperation minusOp(){
        return new PlusOperation();
    }

    @Bean
    public BinaryOperation multiOp(){
        return new PlusOperation();
    }

    @Bean
    public BinaryOperation divideOp(){
        return new PlusOperation();
    }

    @Bean
    public Map<Character, BinaryOperation> operationMap(){
        HashMap<Character, BinaryOperation> map = new HashMap<>();
        map.put('+', plusOp());
        map.put('-', minusOp());
        map.put('*', multiOp());
        map.put('/', divideOp());
        return map;
    }

    @Bean
    public Calculator calculator(){
        return new SimpleCalculator(operationMap());
    }

    @Bean
    public SentenceInput input(){
        return new ConsoleSentenceInput();
    }

    @Bean
    public ResultOutput output(){
        return new ConsoleResultOutput();
    }
}
