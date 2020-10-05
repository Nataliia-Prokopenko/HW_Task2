package com.company;

public class Ex92 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int sizeOfArray = new Scanner(System.in).nextInt();
        int sizeOfArray = 5;
        int step = 3;
        int[][] arrayInitial = new int[sizeOfArray][sizeOfArray];
        int[][] arrayShiftToTheLeft = new int[sizeOfArray][sizeOfArray];

         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.*/

        System.out.println("Матрица: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                int randomGeneratedNumber = ((int) (Math.random() * (sizeOfArray + sizeOfArray)) - sizeOfArray);
                arrayInitial[i][j] = randomGeneratedNumber;
                System.out.print(arrayInitial[i][j] + " ");
            }
            System.out.println("");
        }

        //9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
        //(влево, вверх, вниз).
        System.out.println("сдвиг заданной матрицы на k позиций влево, шаг 2: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                arrayShiftToTheLeft[i][j] = arrayInitial[i][(j + step) % sizeOfArray];
                System.out.print(arrayShiftToTheLeft[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

