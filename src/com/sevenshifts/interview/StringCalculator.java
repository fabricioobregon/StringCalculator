package com.sevenshifts.interview;

public class StringCalculator {

    public static int add(String numbers){


        if(numbers.equals("")){
            return 0;
        }else if(testCustomDelimiter(numbers)){
            return 999;
        }else{
            return addWithCustomDelimiter(numbers, ",");
        }
    }

    public static int addWithCustomDelimiter(String numbers, String delimiter){
        String[]  inputs = numbers.split(delimiter);
        int sumNumbers = 0;

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

//    private static int addCustomDelimiter(String string){
//        String delimiter = "";
//        boolean state = true;
//        int d = 2, i = 3;
//        String subNumbers;
//
//        while(state){
//            delimiter = delimiter + String.valueOf(d);
//            if(string.charAt(d) == '\n'){
//                state = false;
//            }else{
//                d++;
//                i++;
//            }
//        }
//
//
//
//    }


}
