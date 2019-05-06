package com.sevenshifts.interview;

public class Main {

    public static void main(String[] args) {


        System.out.println("Test 1d input empty should result 0. Result: " + StringCalculator.add(""));
        System.out.println("Test 1d input 1,2,5 should result 8. Result: " + StringCalculator.add("1,2,5"));
        System.out.println("Test 1d input 10,20,50 should result 80. Result: " + StringCalculator.add("10,20,50"));
        System.out.println("Test 1d input 11,21,51 should result 83. Result: " + StringCalculator.add("11,21,51"));
        System.out.println("Test 2a input 1\\n,2,3 should result 6. Result: " + StringCalculator.add("1\n,2,3"));
        System.out.println("Test 2b input 1,\\n2,4 should result 7. Result: " + StringCalculator.add("1,\n2,4"));

    }
}
