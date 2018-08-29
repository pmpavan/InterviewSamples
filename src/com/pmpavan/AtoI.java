package com.pmpavan;

public class AtoI {

    public int myAtoi(String str) {
        char[] arr = str.trim().toCharArray();
        int num = 0, pow10 = 10;
        String number = "";
        boolean sign = true;
        for (char letter : arr) {
            int character = (int) letter;
            int value = 0;
            if (Character.isDigit(letter))
                value = Integer.parseInt(String.valueOf(letter));
            System.out.println("char " + character + " letter " + letter + " value " + value);

            if (Character.isLetter(letter) && character != '-' && character != '+' && character != ' ') {
                return signedNumber(sign, num);
            } else if (character == '-') {
                if (num == 0) {
                    sign = false;
                    number += character;
                } else
                    return signedNumber(sign, num);
            } else if ((value >= 0 && value <= 9)) {
                if (num == 0) {
                    num = value;
                    number += value;
                } else {
                    if (value != 0) {
                        num = (num * pow10) + value;
                        number += value;
                    }
                }

            }
            System.out.println("num " + sign + " " + signedNumber(sign, num) + " "+  number);
        }
        return signedNumber(sign, num);
    }

    private int signedNumber(boolean sign, int number) {
        if (!sign)
            number = (-1 * number);
        return number;
    }
}
