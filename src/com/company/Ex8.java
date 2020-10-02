package com.company;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

        int n = 5;
        int[][] a = new int[n][n];
        int currentValue = 1;
        int currentValue1 = 1;

        System.out.println("Числа от 1 до k в виде матрицы N x N слева направо");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = currentValue;
                currentValue++;
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Числа от 1 до k в виде матрицы N x N сверху вниз");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = currentValue1;
                currentValue1++;

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
