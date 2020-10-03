package com.company;

import java.util.Scanner;

public class Ex1 {

// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

    public static void main(String[] args) {
        System.out.println("Please enter n numbers using space: ");
        String numberInput = new Scanner(System.in).nextLine();
        String longest = "";
        String shortest = numberInput;
        String[] numbers = numberInput.split(" ");

        for (String number : numbers
        ) {
            if (number.length() > longest.length()) {
                longest = number;
            }
            if (number.length() < shortest.length()) {
                shortest = number;
            }
        }
        System.out.println("Longest Number: " + longest + " Length is " + longest.length());
        System.out.println("Shortest Number: " + shortest + " Length is " + shortest.length());
    }
}
