package com.company;

import java.util.Arrays;

public class Ex93 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int sizeOfArray = new Scanner(System.in).nextInt();
        int sizeOfArray = 4;
        int[][] array = new int[sizeOfArray][sizeOfArray];
        int[] arrayCounter = new int[sizeOfArray * sizeOfArray];
        int[] arrayString = new int[sizeOfArray * sizeOfArray];

         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.*/

        System.out.println("Матрица: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                int randomGeneratedNumber = ((int) (Math.random() * (sizeOfArray + sizeOfArray)) - sizeOfArray);
                array[i][j] = randomGeneratedNumber;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

//9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        boolean isCountON = false;
        int counter = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sizeOfArray * sizeOfArray; ) {
            for (int j = 0; j < sizeOfArray; j++) {
                for (int k = 0; k < sizeOfArray; k++) {
                    arrayString[i] = array[j][k];
                    i++;
                }
            }
        }
        for (int i = 0; i < sizeOfArray * sizeOfArray - 1; i++) {
            if (arrayString[i] != arrayString[i + 1] - 1) {
                if (counter > 1) {
                    counter = 1;
                    isCountON = false;
                }
            } else {
                if (!isCountON && arrayString[i] == arrayString[i + 1] - 1) {
                    isCountON = true;
                } counter++;
            }
            arrayCounter[i] = counter;
        }
        for (int i = 0; i < sizeOfArray * sizeOfArray; i++) {
            if (arrayCounter[i] > max)
            {
                max = arrayCounter[i];
            }
        }
        System.out.println("наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд: " + max);
    }
}

