package com.pt.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Pattern;

public class CoffeeBeverage extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar.");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.out.println("IO error trying to read your answer.");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
