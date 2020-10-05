package com.company;

public class Ex91 {

    public static void main(String[] args) {

        System.out.println("n-размерность матрицы");
        //int sizeOfArray = new Scanner(System.in).nextInt();
        int sizeOfArray = 5;
        int[][] array = new int[sizeOfArray][sizeOfArray];

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

//9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        System.out.println("Упорядоченые строки: ");
       // a = initial;
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = sizeOfArray - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (array[i][j] >= array[i][k]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][j];
                        array[i][j] = temp;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

