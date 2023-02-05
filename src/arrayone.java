//import javax.swing.*;
//import java.util.Scanner;
//public class arrayone {
//    public static void main(String[] args) {
//        int size;
//        int sum = 0;
//        String text = "Массив из четных чисел: \n";
//        size = Integer.parseInt(JOptionPane.showInputDialog(("Укажитье размер массива:")));
//        int[] nums = new int[size];
//
//        for(int i = 0; i < size; i++){
//            nums[i] =  i;
//            sum += nums[i];
//            text += nums[i]+ " ";
//        }
////        String text1 = "Сумма элемент массива: \n" + sum;
//
////        JOptionPane.showMessageDialog(null, text1);
//        JOptionPane.showMessageDialog(null, text);
//    }
//}

//
//import java.util.HashMap;
//
//public class arrayone {
//    public static void main(String[] args) {
//        String[] array = {"1101", "1001", "1111", "0110", "0110", "1001", "1111", "1101", "0110", "1001", "1111"};
//
//        HashMap<String, Integer> counters = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            if (counters.containsKey(array[i])) {
//                counters.put(array[i], counters.get(array[i]) + 1);
//            } else {
//                counters.put(array[i], 1);
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (counters.get(array[i]) == 2) {
//                System.out.println("Элемент '" + array[i] + "' встречается два раза, его индекс: " + i);
//            }
//        }
//    }
//}

//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем массив с 14 элементами действительного типа
//        double[] arr = new double[14];
//
//        // Заполняем массив случайными числами
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.random();
//        }
//
//        // Выводим исходный массив
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        // Переставляем первую и вторую половины массива
//        int swaps = 0; // счетчик перестановок
//        for (int i = 0; i < arr.length / 2; i++) {
//            double temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//            swaps++;
//        }
//
//        // Выводим полученный массив
//        System.out.println("Полученный массив: " + Arrays.toString(arr));
//        // Выводим количество перестановок
//        System.out.println("Количество перестановок: " + swaps);
//    }
//}


//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем массив с 9 элементами целого типа
//        int[] arr = new int[9];
//
//        // Заполняем массив случайными целыми числами
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//
//        // Выводим исходный массив
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        // Создаем новый массив с суммами цифр элементов исходного массива
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int n = arr[i];
//            int sum = 0;
//            while (n > 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            newArr[i] = sum;
//        }
//
//        // Выводим новый массив
//        System.out.println("Новый массив: " + Arrays.toString(newArr));
//    }
//}


//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем целочисленный массив с 11 элементами
//        int[] arr = new int[11];
//
//        // Заполняем массив случайными целыми числами
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100) - 50;
//        }
//
//        // Выводим исходный массив
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        // Вычисляем сумму нечетных по значению отрицательных элементов
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0 && arr[i] % 2 != 0) {
//                sum += arr[i];
//            }
//        }
//
//        // Заменяем элементы кратные 3 на сумму
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 3 == 0) {
//                arr[i] = sum;
//            }
//        }
//
//        // Выводим полученный массив
//        System.out.println("Полученный массив: " + Arrays.toString(arr));
//    }
//}
//
//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем целочисленный массив с 11 элементами
//        int[] arr = new int[11];
//
//        // Заполняем массив случайными целыми числами
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 20 - 10);
//        }
//
//        // Выводим исходный массив
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        // Вычисляем сумму нечётных отрицательных элементов
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0 && arr[i] % 2 != 0) {
//                sum += arr[i];
//            }
//        }
//
//        // Заменяем элементы, кратные трем, на сумму нечётных отрицательных элементов
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 3 == 0) {
//                arr[i] = sum;
//            }
//        }
//
//        // Выводим измененный массив
//        System.out.println("Измененный массив: " + Arrays.toString(arr));
//    }
//}

//
//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем матрицу целых чисел размера 3x4
//        int[][] matrix = new int[][] {
//                {1, 2, 3, 4},
//                {2, 2, 1, 4},
//                {3, 2, 3, 1}
//        };
//
//        // Выводим матрицу
//        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));
//        }
//
//        // Ищем строку с максимальным числом одинаковых элементов
//        int maxCount = 0;
//        int maxRow = -1;
//        for (int i = 0; i < matrix.length; i++) {
//            int[] row = matrix[i];
//            int count = 0;
//            for (int j = 0; j < row.length; j++) {
//                int n = row[j];
//                for (int k = j + 1; k < row.length; k++) {
//                    if (n == row[k]) {
//                        count++;
//                    }
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxRow = i;
//            }
//        }
//
//        // Выводим номер строки с максимальным числом одинаковых элементов
//        System.out.println("Строка с максимальным числом одинаковых элементов: " + maxRow);
//    }
//}


//import java.util.Arrays;
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем матрицу целых чисел размера 3x4
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 5, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        // Выводим исходную матрицу
//        System.out.println("Исходная матрица:");
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//
//        // Ищем строку с максимальным числом одинаковых элементов
//        int maxCount = 0;
//        int maxRow = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            int[] row = matrix[i];
//            int count = 0;
//            for (int j = 0; j < row.length; j++) {
//                if (row[j] == row[0]) {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxRow = i;
//            }
//        }
//
//        // Выводим номер строки с максимальным числом одинаковых элементов
//        System.out.println("Строка с максимальным числом одинаковых элементов: " + (maxRow + 1));
//    }
//}
//
//
//import java.util.Random;
//import java.util.Arrays;
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем матрицу целых чисел размера 3x3
//        int[][] matrix = new int[3][3];
//
//        // Заполняем матрицу случайными целыми числами
//        Random rnd = new Random();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = rnd.nextInt(10);
//            }
//        }
//
//        // Выводим матрицу
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//
//        // Ищем строку с максимальным числом одинаковых элементов
//        int row = 0;
//        int maxCount = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            int count = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == matrix[i][0]) {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                row = i;
//            }
//        }
//
//        // Выводим номер строки
//        System.out.println("Строка с максимальным числом одинаковых элементов: " + (row + 1));
//    }
//}


//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем массив размера 5x5
//        int[][] A = new int[5][5];
//
//        // Заполняем массив согласно условию
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 2) {
//                    A[i][j] = 1;
//                } else {
//                    A[i][j] = (j % 2 == 0) ? 0 : 1;
//                }
//            }
//        }
//
//        // Выводим массив на экран
//        for (int[] row : A) {
//            for (int val : row) {
//                System.out.print(val);
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//public class arrayone {
//    public static void main(String[] args) {
//        // Создаем массив размера 5x5
//        int[][] A = new int[5][5];
//
//        // Заполняем массив следующим образом:
//        // 00100
//        // 00100
//        // 11111
//        // 00100
//        // 00100
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A[i].length; j++) {
//                if (i == 2 || j == 2 || j == 5) {
//                    A[i][j] = 1;
//                } else {
//                    A[i][j] = 0;
//                }
//            }
//        }
//
//        // Выводим массив на экран
//        for (int[] row : A) {
//            for (int x : row) {
//                System.out.print(x);
//            }
//            System.out.println();
//        }
//    }
//}



public class arrayone {
    public static void main(String[] args) {
        // Создаем матрицу А
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Находим строку с минимальной суммой элементов
        int minSumRow = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            if (sum < minSum) {
                minSum = sum;
                minSumRow = i;
            }
        }

        // Умножаем каждый элемент матрицы А на минимальную сумму
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] *= minSum;
            }
        }

        // Выводим измененную матрицу А
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

