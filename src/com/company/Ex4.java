package com.company;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        //1 22 1 333 1 4444 22 55555

        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String[] numbers = numberInput.split(" ");

        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            String[] digits = numbers[i].split("");
            int count = getUniqueDigitCount(digits);
            if (min > count) {
                min = count;
                index = i;
            }
        }
        System.out.println("Число, в котором число различных цифр минимально" + numbers[index]);
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





