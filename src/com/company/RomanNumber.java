package com.company;

public class RomanNumber {


    public String mathOperationRoman;
    public String[] mathOperationPartsRoman;
    public String oneNumStringRoman;
    public String twoNumStringRoman;
    public String[] resultRomanArray;

    public int oneNumIntRoman;
    public int twoNumIntRoman;
    public int resultRoman;



    public void splitScanStringRoman() {
        mathOperationPartsRoman = mathOperationRoman.split("[+-/*]+");
    }

    public void trimNumbersRoman() {
        oneNumStringRoman = mathOperationPartsRoman[0].trim();
        twoNumStringRoman = mathOperationPartsRoman[1].trim();
    }


    public void oneNumRomanToInteger() {
        if (oneNumStringRoman.equals("I"))
            oneNumIntRoman = 1;
        else if (oneNumStringRoman.equals("II"))
            oneNumIntRoman = 2;
        else if (oneNumStringRoman.equals("III"))
            oneNumIntRoman = 3;
        else if (oneNumStringRoman.equals("IV"))
            oneNumIntRoman = 4;
        else if (oneNumStringRoman.equals("V"))
            oneNumIntRoman = 5;
        else if (oneNumStringRoman.equals("VI"))
            oneNumIntRoman = 6;
        else if (oneNumStringRoman.equals("VII"))
            oneNumIntRoman = 7;
        else if (oneNumStringRoman.equals("VIII"))
            oneNumIntRoman = 8;
        else if (oneNumStringRoman.equals("IX"))
            oneNumIntRoman = 9;
        else if (oneNumStringRoman.equals("X"))
            oneNumIntRoman = 10;
        else oneNumIntRoman = 1 / oneNumIntRoman;
    }

    public void twoNumRomanToInteger() {
        if (twoNumStringRoman.equals("I"))
            twoNumIntRoman = 1;
        else if (twoNumStringRoman.equals("II"))
            twoNumIntRoman = 2;
        else if (twoNumStringRoman.equals("III"))
            twoNumIntRoman = 3;
        else if (twoNumStringRoman.equals("IV"))
            twoNumIntRoman = 4;
        else if (twoNumStringRoman.equals("V"))
            twoNumIntRoman = 5;
        else if (twoNumStringRoman.equals("VI"))
            twoNumIntRoman = 6;
        else if (twoNumStringRoman.equals("VII"))
            twoNumIntRoman = 7;
        else if (twoNumStringRoman.equals("VIII"))
            twoNumIntRoman = 8;
        else if (twoNumStringRoman.equals("IX"))
            twoNumIntRoman = 9;
        else if (twoNumStringRoman.equals("X"))
            twoNumIntRoman = 10;
        else twoNumIntRoman = 1 / twoNumIntRoman;
    }


    public void operationRoman() {
        if (mathOperationRoman.contains("+"))
            resultRoman = oneNumIntRoman + twoNumIntRoman;
        if (mathOperationRoman.contains("-"))
            resultRoman = oneNumIntRoman - twoNumIntRoman;
        if (mathOperationRoman.contains("*"))
            resultRoman = oneNumIntRoman * twoNumIntRoman;
        if (mathOperationRoman.contains("/"))
            resultRoman = oneNumIntRoman / twoNumIntRoman;
    }

    public void arrayRomanNumber() {
        resultRomanArray = new String[] {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
                "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
                "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII",
                "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
                "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
                "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII",
                "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",  "XCI", "XCII",
                "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    }

    public void minusValues() {
        if (resultRoman == -9)
            System.out.println("-IX");
        else if (resultRoman == -8)
            System.out.println("-VIII");
        else if (resultRoman == -7)
            System.out.println("-VII");
        else if (resultRoman == -6)
            System.out.println("-VI");
        else if (resultRoman == -5)
            System.out.println("-V");
        else if (resultRoman == -4)
            System.out.println("-IV");
        else if (resultRoman == -3)
            System.out.println("-III");
        else if (resultRoman == -2)
            System.out.println("-II");
        else if (resultRoman == -1)
            System.out.println("-I");
        else
            System.out.println(resultRomanArray[resultRoman]);

    }
}
