import java.util.Scanner;

public class SRSzadacha3 {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0};
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[0]) {
                count++;
            }
        }

        System.out.println("Количество элементов, значения которых больше первого элемента: " + count);

    }
}

