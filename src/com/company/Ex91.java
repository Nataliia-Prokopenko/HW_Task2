package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex91 {

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

//9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        System.out.println("Упорядоченые строки: ");
       // a = initial;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][j] >= a[i][k]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][j];
                        a[i][j] = temp;
                    }
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

