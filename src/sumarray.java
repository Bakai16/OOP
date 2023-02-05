import java.util.Scanner;
public class sumarray {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int Size, i, EvenSum = 0;
        sc = new Scanner(System.in);

        System.out.print(" Пожалуйста, введите количество элементов в массиве : ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        for(i = 0; i < Size; i++){
            a[i] =  2 * i + 2;
            //Size += a[i]+ " ";
            System.out.print(a[i]+ " ");
            if(a[i] % 2 == 0){
                EvenSum = EvenSum + a[i] ;
            }else{
                EvenSum = EvenSum + a[i];
            }

        }
        System.out.println("\n Сумма четных чисел в этом массиве = " + EvenSum);
    }
}
