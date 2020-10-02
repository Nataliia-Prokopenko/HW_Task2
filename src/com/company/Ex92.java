package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex92 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int n = new Scanner(System.in).nextInt();
        int n = 5;
        int l = 3;
        // int[][] initial = new int[n][n];
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

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

        //9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
        //(влево, вверх, вниз).
        System.out.println("сдвиг заданной матрицы на k позиций влево, шаг 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i][(j + l) % n];
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

