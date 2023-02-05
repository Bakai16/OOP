import java.util.Scanner;
public class evenAndOddNumbers {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int Size, i, EvenSum = 0, OddSum = 0;;
        sc = new Scanner(System.in);

        System.out.print(" Пожалуйста, введите количество элементов в массиве : ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        System.out.print(" Пожалуйста, введите " + Size + " элементы массива  : ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }

        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                EvenSum = EvenSum + a[i];
            }
            else
            {
                OddSum = OddSum + a[i];
            }
        }
        System.out.println("\n Сумма четных чисел в этом массиве = " + EvenSum);
        System.out.println(" Сумма нечетных чисел в этом массиве = " + OddSum);
    }
}
