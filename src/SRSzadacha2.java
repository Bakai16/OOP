import java.util.Scanner;
public class SRSzadacha2 {
    public static void main (String[]args)
    {
        final int N = 10;
        int[] A = new int[N + 1];
        int i_max, max_v;

        Scanner in = new Scanner(System.in);
        System.out.printf("A[1] = ");
        A[1] = in.nextInt();
        i_max = 1;
        max_v = A[1];
        for (int i = 2; i <= N; i++)
        {
            System.out.printf("A[%d] = ", i);
            A[i] = in.nextInt();
            if(A[i] > max_v)
            {
                i_max = i;
                max_v = A[i];
            }
        }

        max_v = A[1];
        A[1] = A[i_max];
        A[i_max] = max_v;

        for (int i = 1; i <= N; i++)
            System.out.printf("%d ", A[i]);
    }
}
