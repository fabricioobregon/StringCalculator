package com.sevenshifts.interview;

public class StringCalculator {

    public static int add(String numbers) throws Exception {
        if (numbers.isBlank()) {
            return 0;
        } else if (testCustomDelimiter(numbers)) {
            return findCustomDelimiter(numbers);
        } else {
            return addWithCustomDelimiter(numbers, ",");
        }
    }

    public static int addWithCustomDelimiter(String numbers, String delimiter) throws Exception {
        String[] inputs = numbers.split(delimiter); //delimiter.lenght
        int sumNumbers = 0;
        int inputToInt;
        String negativeNotAllowed = "";


        for (String input : inputs) {
            inputToInt = Integer.parseInt(input.replaceAll("\n", ""));
            if (inputToInt < 0) {
                negativeNotAllowed = negativeNotAllowed + input.replace("\n", "") + " ";
            } else {

                if (inputToInt < 1001) {
                    sumNumbers += inputToInt;
                }
            }
        }

        if (negativeNotAllowed.equals("")) {
            return sumNumbers;
        } else {
            throw new Exception("Negatives not allowed:  " + negativeNotAllowed);
        }
    }


    private static boolean testCustomDelimiter(String numbers) {
        if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
            return true;
        }
        return false;
    }


    private static int findCustomDelimiter(String numbers) throws Exception {
        String delimiter = "";
        boolean state = true;
        int d = 2, i = 3;
        String subNumbers;

        while (state) {
            delimiter = delimiter + String.valueOf(numbers.charAt(d));
            if (numbers.charAt(i) == '\n') {
                state = false;
            } else {
                d++;
                i++;
            }
        }

        delimiter = delimiter.replaceAll("(.)\\1+", "$1");
        delimiter = "[" + delimiter + "]";
        subNumbers = numbers.substring(i).replaceAll("(.)\\1+", "$1");
//        System.out.println("subnumber " + subNumbers);
//        System.out.println("delimiter " + delimiter);
        return addWithCustomDelimiter(subNumbers, delimiter);
    }


}
