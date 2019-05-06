package com.sevenshifts.interview;

public class StringCalculator {

    public static int add(String numbers){
        if(numbers.isBlank()){
            return 0;
        }else if(testCustomDelimiter(numbers)){
            return findCustomDelimiter(numbers);
        }else{
            return addWithCustomDelimiter(numbers, ",");
        }
    }

    public static int addWithCustomDelimiter(String numbers, String delimiter){
        String[] inputs = numbers.split(delimiter);
        int sumNumbers = 0;

//        System.out.println(inputs[0]);
//        System.out.println(inputs[1]);
//        System.out.println(inputs[2]);


        for (String input: inputs) {
            sumNumbers += Integer.parseInt(input.replace("\n", ""));
        }
        return sumNumbers;
    }



    private static boolean testCustomDelimiter(String numbers){
        if(numbers.charAt(0) == '/' && numbers.charAt(1) == '/'){
            return true;
        }
        return false;
    }



    private static int findCustomDelimiter(String numbers){
        String delimiter = "";
        boolean state = true;
        int d = 2, i = 3;
        String subNumbers;

        while(state){
            delimiter = delimiter + String.valueOf(numbers.charAt(d));
            if(numbers.charAt(d) == '\n'){
                state = false;
            }else{
                d++;
                i++;
            }
        }


        delimiter = "[" + delimiter + "]";
        subNumbers = numbers.substring(i);
//        System.out.println("subnumber " + subNumbers);
//        System.out.println("delimiter " + delimiter);
        return addWithCustomDelimiter(subNumbers, delimiter);
    }


}
