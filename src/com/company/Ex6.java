package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        ///6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String[] numbers = numberInput.split(" ");

        for (String number : numbers
        ) {
            String[] digits = number.split("");
            int index = 0;
            for (int i = 0; i < digits.length - 1; i++) {
                if (Integer.parseInt(digits[i]) < Integer.parseInt(digits[i + 1])) {
                    index = i + 1;
                }
                if (index == digits.length - 1) {
                    System.out.println("Цифры в котором идут в строгом порядке возрастания" + number);
                    break;
                }
            }
        }
    }
}

