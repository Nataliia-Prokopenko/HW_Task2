package com.company;

public class Ex95 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int n = new Scanner(System.in).nextInt();
        int sizeOfArray = 6;
        int[][] arrayInitial = new int[sizeOfArray][sizeOfArray];
        int[][] arrayTurnTo90 = new int[sizeOfArray][sizeOfArray];
        int[][] arrayTurnTo180 = new int[sizeOfArray][sizeOfArray];
        int[][] arrayTurnTo270 = new int[sizeOfArray][sizeOfArray];

         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.*/

        System.out.println("Матрица: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                int randomGeneratedNumber = ((int) (Math.random() * (sizeOfArray + sizeOfArray)) - sizeOfArray);
                arrayInitial[i][j] = randomGeneratedNumber;
                arrayTurnTo90[i][j] = randomGeneratedNumber;
                arrayTurnTo180[i][j] = randomGeneratedNumber;
                arrayTurnTo270[i][j] = randomGeneratedNumber;
                System.out.print(arrayInitial[i][j] + " ");
            }
            System.out.println("");
        }

//9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.

        System.out.println("Матрицу на 90 градусов против часовой стрелки: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                arrayTurnTo90[i][j] = arrayInitial[j][sizeOfArray - i - 1];
                System.out.print(arrayTurnTo90[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Матрицу на 180 градусов против часовой стрелки: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                arrayTurnTo180[i][j] = arrayInitial[j][sizeOfArray - i - 1];
                System.out.print(arrayTurnTo180[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Матрицу на 270 градусов против часовой стрелки: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                arrayTurnTo270[i][j] = arrayInitial[sizeOfArray - j - 1][i];
                System.out.print(arrayTurnTo270[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

