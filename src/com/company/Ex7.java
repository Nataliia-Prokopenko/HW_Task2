package com.company;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

        System.out.println("Please enter n numbers using space: ");
        String scanner = new Scanner(System.in).nextLine();
        String[] numbers = scanner.split(" ");

        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            String[] digits = numbers[i].split("");
            int count = getUniqueDigitCount(digits);
            if (count == 0) {
                index = i;
                System.out.println("Число, состоящее только из различных цифр: " + numbers[index]);
                break;
            }
        }
    }

    private static int getUniqueDigitCount(String[] digits) {
        int countUniqueDigits = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (digits[i].equals(digits[j])) {
                    countUniqueDigits++;
                }
            }
        }
        return countUniqueDigits;
    }
}