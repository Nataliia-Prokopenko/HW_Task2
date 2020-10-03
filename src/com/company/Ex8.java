package com.company;

public class Ex8 {
    public static void main(String[] args) {
        //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

        int size = 5;
        int[][] array = new int[size][size];
        int currentValue = 1;
        int currentValue1 = 1;

        System.out.println("Числа от 1 до k в виде матрицы N x N слева направо");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = currentValue;
                currentValue++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Числа от 1 до k в виде матрицы N x N сверху вниз");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = currentValue1;
                currentValue1++;

            }

        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < j) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
