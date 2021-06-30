package com.company;

public class ArabicNumber {

    public String mathOperationArabic;
    public String[] mathOperationPartsArabic;
    public String oneNumStringArabic;
    public String twoNumStringArabic;

    public int oneNumIntArabic;
    public int twoNumIntArabic;
    public int resultArabic;


    public void splitScanStringArabic() {
        mathOperationPartsArabic = mathOperationArabic.split("[+-/*]+");
    }

    public void trimNumbersArabic() {
        oneNumStringArabic = mathOperationPartsArabic[0].trim();
        twoNumStringArabic = mathOperationPartsArabic[1].trim();
    }

    public void numStringToIntArabic() {
        oneNumIntArabic = Integer.parseInt(oneNumStringArabic);
        twoNumIntArabic = Integer.parseInt(twoNumStringArabic);
    }

    public void operationArabic() {
        if (mathOperationArabic.contains("+") && oneNumIntArabic >=1 && oneNumIntArabic <= 10 && twoNumIntArabic >=1 &&
                twoNumIntArabic <= 10)
            resultArabic = oneNumIntArabic + twoNumIntArabic;
        else if (mathOperationArabic.contains("-") && oneNumIntArabic >=1 && oneNumIntArabic <= 10 && twoNumIntArabic >=1 &&
                twoNumIntArabic <= 10)
            resultArabic = oneNumIntArabic - twoNumIntArabic;
        else if (mathOperationArabic.contains("*") && oneNumIntArabic >=1 && oneNumIntArabic <= 10 && twoNumIntArabic >=1 &&
                twoNumIntArabic <= 10)
            resultArabic = oneNumIntArabic * twoNumIntArabic;
        else if (mathOperationArabic.contains("/") && oneNumIntArabic >=1 && oneNumIntArabic <= 10 && twoNumIntArabic >=1 &&
                twoNumIntArabic <= 10)
            resultArabic = oneNumIntArabic / twoNumIntArabic;
        else resultArabic = 1 / resultArabic;
    }
}
