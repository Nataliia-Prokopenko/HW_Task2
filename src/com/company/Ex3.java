package com.company;
import java.util.Scanner;

public class Ex3 {

    //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

    public static void main(String[] args) {

        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String[] numbers = numberInput.split(" ");

        for (String number : numbers
        ) {
            int size = numberInput.length() - numbers.length + 1;
            if (number.length() <= size / numbers.length) {
                System.out.println("Числа, длина которых меньше (больше) средней: " + number + " Длина: " + number.length());
            }
        }
    }
}
