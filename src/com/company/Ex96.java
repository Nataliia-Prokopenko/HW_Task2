package com.company;

public class Ex96 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int n = new Scanner(System.in).nextInt();
        int sizeOfArray = 6;
        int[][] arrayInitial = new int[sizeOfArray][sizeOfArray];
        int[][] arrayConverted = new int[sizeOfArray][sizeOfArray];

         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.*/

        System.out.println("Матрица: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                int randomGeneratedNumber = ((int) (Math.random() * (sizeOfArray + sizeOfArray)) - sizeOfArray);
                arrayInitial[i][j] = randomGeneratedNumber;
                arrayConverted[i][j] = randomGeneratedNumber;
                System.out.print(arrayInitial[i][j] + " ");
            }
            System.out.println("");
        }

//9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
        System.out.println("Матрица, а вычетом из элементов каждой строки ее среднее арифметическое ");

        for (int i = 0; i < sizeOfArray; i++) {
            int average = getAverage(arrayInitial[i]);
            for (int j = 0; j < sizeOfArray; j++) {
                arrayConverted[i][j] = arrayInitial[i][j] - average;
                System.out.print(arrayConverted[i][j] + " ");
            }
            System.out.print("Avr: " + average);
            System.out.println("");
        }
    }

    public static int getAverage(int[] numbers) {
        int sum = 0;
        for (int currentNumber : numbers) {
            sum = sum + currentNumber;
        }
        return sum / numbers.length;
    }
}