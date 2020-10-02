package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex94 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int n = new Scanner(System.in).nextInt();
        int n = 5;
        int l = 3;
        // int[][] initial = new int[n][n];
        int[][] a = new int[n][n];

         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.*/

        System.out.println("Матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = ((int) (Math.random() * (n + n)) - n);
                a[i][j] = v;
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

//9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.

        System.out.println("сумма элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки: ");
        for (int i = 0; i < n; i++) {
            boolean isCountON = false;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (isCountON && a[i][j] <= 0) {
                    sum += a[i][j];
                }
                else if (a[i][j] > 0) {
                    if (isCountON)
                    {
                        break;
                    }
                    else {
                        isCountON = true;
                    }
                }
            }
            System.out.print(sum + " ");
            System.out.println("");
        }
    }
}

