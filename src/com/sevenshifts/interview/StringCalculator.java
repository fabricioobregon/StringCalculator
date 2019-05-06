package com.sevenshifts.interview;

public class StringCalculator {

    public static int add(String numbers){
        String[]  inputs = numbers.split(",");
        int sumNumbers = 0;

        if(numbers.equals("")){
            return 0;
        }else{
            for (String input: inputs) {
                sumNumbers += Integer.parseInt(input);
            }
            return sumNumbers;
        }
    }
}
