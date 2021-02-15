package ru.itis.antonov;

import java.util.Scanner;

public class ConsoleSentenceInput implements SentenceInput{

    private Scanner sc;

    @Override
    public String getSentence() {
        return sc.nextLine();
    }

    public ConsoleSentenceInput() {
        sc = new Scanner(System.in);
    }
}
