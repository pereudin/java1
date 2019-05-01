public class ArrayAndLoops {
    public static void main(String[] args) {
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. " +
                "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. " +
                "С помощью цикла и условия заменить 0 на 1, 1 на 0.");
        System.out.println("Решение:");

        // решение п.1 Задания 2
        byte[] oneZero = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < oneZero.length; i++) {
            if (oneZero[i] == 1) {
                oneZero[i] = 0;
            } else oneZero[i] = 1;

            // проверка п.1 Задания 2
            System.out.print(oneZero[i] + " ");
        }

        System.out.println("\n");
        System.out.println("2. Задать пустой целочисленный массив размером 8. " +
                "С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.");
        System.out.println("Решение:");

        // решение п.2 Задания 2
        int arr1[] = new int[8];
        for (int i = 0, j = 0; i < arr1.length; i++, j += 3) {
            arr1[i] = j;

            // проверка п.2 Задания 2
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n");
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], " +
                "пройти по нему циклом, и числа, меньшие 6, умножить на 2.");
        System.out.println("Решение:");

        // решение п.3 Задания 2
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }

            // проверка п.3 Задания 2
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");
        System.out.println("4. Создать квадратный двумерный целочисленный массив " +
                "(количество строк и столбцов одинаковое), и с помощью цикла(-ов) " +
                "заполнить его диагональные элементы единицами.");
        System.out.println("Решение:");

        // решение п.4 Задания 2
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) arr3[i][j] = 1;

                // проверка п.4 Задания 2
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("5. Задать одномерный массив и найти в нем минимальный " +
                "и максимальный элементы (без помощи интернета).");
        System.out.println("Решение:");

        // решение п.5 Задания 2
        int arr4[] = new int[5];
        arr4[0] = 3;
        arr4[1] = 102;
        arr4[2] = -75;
        arr4[3] = 23;
        arr4[4] = 0;
        int max = 0, min = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (max < arr4[i]) max = arr4[i];
            if (min > arr4[i]) min = arr4[i];
        }

        // проверка п.5 Задания 2
        System.out.println("Максимальное значение массива arr4: " + max);
        System.out.println("Минимальное значение массива arr4: " + min);

        // проверка п.6 Задания 2 (решение на строках 124-138)
        int[] arr5 = {1, 1, 1, 2, 1};
        int[] arr6 = {2, 1, 1, 2, 1};
        int[] arr7 = {10, 10};

        System.out.println("\n");
        System.out.println("6. Написать метод, в который передается не пустой одномерный целочисленный массив, " +
                "метод должен вернуть true, если в массиве есть место, " +
                "в котором сумма левой и правой части массива равны.");
        System.out.println("Вывод метода checkBalance для массива [1, 1, 1, 2, 1]: " + checkBalance(arr5));
        System.out.println("Вывод метода checkBalance для массива [2, 1, 1, 2, 1]: " + checkBalance(arr6));
        System.out.println("Вывод метода checkBalance для массива [10, 10]: " + checkBalance(arr7));

        // проверка п.7 Задания 2 (решение на строках 141-158)
        int[] arr8 = {1, 2, 3, 4, 5};
        int[] arr9 = {5, 4, 3, 2, 1};
        offsetByN(arr8, 3);
        offsetByN(arr9, -2);

        System.out.println("\n");
        System.out.println("7. *Написать метод, которому на вход подается одномерный массив и число n " +
                "(может быть положительным или отрицательным), при этом метод должен сместить все " +
                "элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.");
        System.out.print("Вывод метода при передаче ему массива [1, 2, 3, 4, 5] и n = 3: ");
        for(int i = 0; i < arr8.length; i++) {
            System.out.print(arr8[i] + " ");
        }
        System.out.println();
        System.out.print("Вывод метода при передаче ему массива [5, 4, 3, 2, 1] и n = -2: ");
        for(int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i] + " ");
        }
    }

    // решение п.6 Задания 2
    public static boolean checkBalance(int[] array) {
        int len = array.length;
        int firstHalf = array[0];
        int secondHalf = array[len - 1];

        for (int i = 1, j = len - 1; i < j; i++) {
            if (firstHalf <= secondHalf) {
                firstHalf += array[i];
            } else if (firstHalf > secondHalf) {
                secondHalf += array[--j];
                i--;
            }
        }
        return firstHalf == secondHalf;
    }

    // решение п.7 Задания 2
    public static void offsetByN(int[] array, int n) {
        if (n > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (i >= n) {
                    array[i] = array[i - n];
                } else array[i] = 0;
            }
        } else if (n < 0) {
            for (int i = 0; i < array.length; i++) {
                if ((i + n) >= 0) {
                    array[i + n] = array[i];
                    array[i] = 0;
                } else if(i + n <= 0) {
                    array[i] = 0;
                }
            }
        }
    }

}
