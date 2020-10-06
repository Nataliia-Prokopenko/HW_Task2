package com.company;

public class Ex97 {

    public static void main(String[] args) {
        //int sizeOfArray = new Scanner(System.in).nextInt();
        int sizeOfArray = 6;
        System.out.println("n-размерность матрицы " + sizeOfArray);
        int[][] arrayInitial = new int[sizeOfArray][sizeOfArray];
        int[][] arrayConverted = new int[sizeOfArray][sizeOfArray];
        int zeroColumn = Math.abs((int) (Math.random() * ((sizeOfArray - 1) + (sizeOfArray - 1))) - (sizeOfArray - 1));
        int zeroLine = Math.abs((int) (Math.random() * ((sizeOfArray - 1) + (sizeOfArray - 1))) - (sizeOfArray - 1));
        System.out.println("n-размерность матрицы");
        //int sizeOfArray = new Scanner(System.in).nextInt();
         /*9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел*/
        // толбцы и стороки запонены нулями, номера их генеряться случайно
        System.out.println("Матрица: ");
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {

                if ((i == zeroLine) || (j == zeroColumn)) {
                    arrayInitial[i][j] = 0;
                } else {
                    int randomGeneratedNumber = ((int) (Math.random() * (sizeOfArray + sizeOfArray)) - sizeOfArray);
                    arrayInitial[i][j] = randomGeneratedNumber;
                }
                System.out.print(arrayInitial[i][j] + " ");
            }
            System.out.println("");
        }
//9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
        // поиск нулевой строки
        System.out.println("матрицу, удаляя из нее строки и столбцы, заполненные нулями");
        boolean[] arrayLine = new boolean[sizeOfArray];
        boolean[] arrayColumn = new boolean[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                if (arrayInitial[i][j] != 0)
                {
                    arrayLine[i] = true;
                    arrayColumn[j] = true;
                }
            }
        }
        int zeroLineIndex = 0;
        int zeroColumnIndex = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (!arrayLine[i]) {
                zeroLineIndex = i;
            }
            if (!arrayColumn[i]) {
                zeroColumnIndex = i;
            }
        }
        // новая матрица
        int[][] arrayWithoutZeroLine = new int[sizeOfArray][sizeOfArray];
        for (int i = 0; i < sizeOfArray - 1; i++) {

            for (int j = 0; j < sizeOfArray; j++) {
                if (i >= zeroLineIndex) {
                    arrayWithoutZeroLine[i][j] = arrayInitial[i + 1][j];
                }
                if (i < zeroLineIndex) {
                    arrayWithoutZeroLine[i][j] = arrayInitial[i][j];
                }
            }
        }
        System.out.println("");
        int[][] arrayWithoutZeroLineAndColumn = new int[sizeOfArray - 1][sizeOfArray];
        for (int i = 0; i < sizeOfArray - 1; i++) {
            for (int j = 0; j < sizeOfArray - 1; j++) {
                if (j >= zeroColumnIndex) {
                    arrayWithoutZeroLineAndColumn[i][j] = arrayWithoutZeroLine[i][j + 1];
                }
                if (j < zeroColumnIndex) {
                    arrayWithoutZeroLineAndColumn[i][j] = arrayWithoutZeroLine[i][j];
                }
                System.out.print(arrayWithoutZeroLineAndColumn[i][j] + " ");
            }
            System.out.println("");
        }
    }
}