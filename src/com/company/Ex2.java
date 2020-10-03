package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

    public static void main(String[] args) {
        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String[] numbers = numberInput.split(" ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j].length() > numbers[j + 1].length()) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Числа в порядке возрастания: ");
        System.out.println(Arrays.toString(numbers));
    }
}
