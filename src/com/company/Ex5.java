package com.company;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        // 5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.

        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String[] numbers = numberInput.split(" ");

        int countOfOddNumbers = 0;
        for (String number : numbers) {
            String[] digits = number.split("");
            int countOddDigits = onlyOddDigits(digits);
            if (countOddDigits > 0) {
                countOfOddNumbers++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры: " + countOfOddNumbers);

        int equalOddEvenDigits = 0;
        for (String number : numbers) {
            String[] digits = number.split("");
            int countEvenDigits = countEvenDigits(digits);
            int countOddDigits = countOddDigits(digits);
            if (countEvenDigits == countOddDigits) {
                equalOddEvenDigits++;
            }
        }
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + equalOddEvenDigits);
    }

    private static int onlyOddDigits(String[] digits) {
        int countOddDigits = 0;
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 == 0) {
                countOddDigits++;
            } else {
                countOddDigits = 0;
            }
        }
        return countOddDigits;
    }

    private static int countOddDigits(String[] digits) {
        int countOddDigits = 0;
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 == 0) {
                countOddDigits++;
            }
        }
        return countOddDigits;
    }

    private static int countEvenDigits(String[] digits) {
        int countEvenDigits = 0;
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 != 0) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }
}


