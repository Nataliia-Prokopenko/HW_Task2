package com.company;

public class Ex98 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int sizeOfArray = new Scanner(System.in).nextInt();
        int sizeOfArray = 6;
        int[][] arrayInitial = new int[sizeOfArray][sizeOfArray];
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
        System.out.println("");
        System.out.println("строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.");
//9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
        int countOfZeroElement = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {

                if ((arrayInitial[i][j] == 0 && j < (sizeOfArray - 1))) {
                    int temp = arrayInitial[i][j];
                    arrayInitial[i][j] = arrayInitial[i][j + 1];
                    arrayInitial[i][j + 1] = temp;
                } else arrayInitial[i][j] = arrayInitial[i][j];

                System.out.print(arrayInitial[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

