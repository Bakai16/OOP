import java.util.Random;
import java.util.Scanner;

public class TaskSimpleArray1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Строк в массиве: ");
        //Five me M
        int n = in.nextInt();

        System.out.print("Столбцов в массиве: ");

        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            int negative = 0;

            for (int j = 0; j < m; j++) {
                matrix[i][j] = rnd.nextInt(199) - 99;

                if (matrix[i][j] >= 0) {
                    negative++;
                }

                System.out.printf("%3d ", matrix[i][j]);
            }

            System.out.println(", positive: " + negative);
        }
    }

}
