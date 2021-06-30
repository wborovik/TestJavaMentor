package com.company;

import java.util.Scanner;

public class TestJavaMentor {

    static ArabicNumber arabic = new ArabicNumber();
    static RomanNumber roman = new RomanNumber();


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input:");

        String mathOperation;
        mathOperation = scan.nextLine();

        if (mathOperation.contains("1") || mathOperation.contains("2") || mathOperation.contains("3") ||
                mathOperation.contains("4") || mathOperation.contains("5") || mathOperation.contains("6") ||
                mathOperation.contains("7") || mathOperation.contains("8") || mathOperation.contains("9") ||
                mathOperation.contains("10"))
        {
            arabic.mathOperationArabic = mathOperation;
            roman.mathOperationRoman = "I+I";
        }

        if (mathOperation.contains("I") || mathOperation.contains("II") || mathOperation.contains("III") ||
                mathOperation.contains("IV") || mathOperation.contains("V") || mathOperation.contains("VI") ||
                mathOperation.contains("VII") || mathOperation.contains("VIII") || mathOperation.contains("IX") ||
                mathOperation.contains("X"))
        {
            roman.mathOperationRoman = mathOperation;
            arabic.mathOperationArabic = "1+1";
        }

        arabic.resultArabic = 0;

        arabic.splitScanStringArabic();
        arabic.trimNumbersArabic();
        arabic.numStringToIntArabic();
        arabic.operationArabic();

        System.out.println("Output:");

        roman.oneNumIntRoman = 0;
        roman.twoNumIntRoman = 0;
        roman.resultRoman = 0;

        roman.splitScanStringRoman();
        roman.trimNumbersRoman();
        roman.oneNumRomanToInteger();
        roman.twoNumRomanToInteger();
        roman.operationRoman();
        roman.arrayRomanNumber();


        if (arabic.mathOperationArabic.equals(mathOperation))
            System.out.println(arabic.resultArabic);

        if (roman.mathOperationRoman.equals(mathOperation))
            roman.minusValues();

    }
}
