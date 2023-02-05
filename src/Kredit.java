//import java.util.Scanner;
//import javax.swing.*;
//public class Kredit {
//
//    static void method(double credit){
//        Scanner in = new Scanner(System.in); //Сканнер пришлось продублировать
//
//        double sumPagash;
//
//        while (true){
//            System.out.println("\nВыберите действие:\n1. Завершение программы\n2. Погасить кредит\n");
//            int vibor = in.nextInt();
//
//            if (credit <= 0) {System.out.println("Ваш кредит погашен! Завершение программы"); break; }
//
//            begin: switch (vibor){
//                case 1:
//                    System.out.println("Завершение программы");
//                    return;
//                case 2:
//                    System.out.println("Ваш долг на данный момент: "+credit+"\nВведите сумму погашения: ");
//                    sumPagash = in.nextDouble();
//
//                    if (sumPagash < 100) {
//                        System.out.println("Ошибка! Введите сумму больше 100.");
//                        break begin;
//                    }else if (sumPagash > credit){
//                        System.out.println("Сумма погашения больше чем ваш долг, введите верную сумму!");
//                        break begin;
//                    }
//
//                    credit -= sumPagash;
//                    if (credit <= 0) {
//                        System.out.println("Остаток кредита: "+credit+" Ваш кредит погашен!");
//                    }else {
//                        System.out.println("Остаток кредита: "+credit);
//                    }
//
//                    method(credit); //Рекурсивно обращаемся к методу main
//                    return; //Выходим из цикла без попадания в рекурсию
//                default:
//                    System.out.println("Ошибка!");
//                    continue;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        double credit = 700;
//        method(credit);
//    }
//}



import javax.swing.*;
import java.util.Scanner;
public class Kredit {
//    public static void main(String[] args) {
//        int month;
//        int amount = 10 / 100;
//        int sum = 1000;
//        int y = 10;
//        int num;
//        String text;
//        text = JOptionPane.showInputDialog("Кредитный калкулятор");
//        month = Integer.parseInt(text);
//
//        switch (month){
//            case 1:
//                num = sum-(sum * y / 100);
//                break;
//
//            default:
//                num = 9;
//
//        }
//        JOptionPane.showMessageDialog(null, num);
//    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    //your code goes here

    for (int x = 0; x < 3; x++) {
        amount = amount - (amount / 100 * 10);


    }
    System.out.println(amount);
}
}
