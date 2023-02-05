import java.util.Arrays;
import javax.swing.*;
import java.util. Scanner;
public class TaskSimpleArray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {1, 2, 3, 4}};
        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            int similarElements = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    if (matrix[i][j] == matrix[0][k]) {
                        similarElements++;
                        break;
                    }
                }
            }
            if (similarElements == matrix[0].length) {
                count++;
            }
        }

        System.out.println("Количество строк, похожих на первую: " + count);


    }
}
