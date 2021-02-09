package Revised_Test_Project;

import com.Habsida.WrongEnteredNumbers;


public class Calculator {

    public static boolean isIncompatible(int n) {
        return n < 1 || n > 10;
    }


    public static String calculate(String a, String b, String op) throws WrongEnteredNumbers {
        int n1 = RN.romanToArabic(a);
        int n2 = RN.romanToArabic(b);

        if (isIncompatible(n1) | (isIncompatible(n2))) throw new WrongEnteredNumbers();

        int res = calculate(n1, n2, op);
        if (res < 1) return "Sorry, Roman Can not be Negative No 0 ";
        return RN.arabicToRoman(res);
    }

    public static int calculate(int a, int b, String op) throws WrongEnteredNumbers {

        if (isIncompatible(a) | (isIncompatible(b))) throw new WrongEnteredNumbers();

        switch (op) {
            case ("+"):
                return add(a, b);
            case ("-"):
                return subtract(a, b);
            case ("*"):
                return multiply(a, b);
            default:
                return divide(a, b);
        }
    }


    private static int multiply(int a, int b) {
        return a * b;
    }


    private static int subtract(int a, int b) {
        return a - b;
    }


    private static int add(int a, int b) {
        return a + b;
    }


    private static int divide(int a, int b) {
        return a / b;
    }

}