//import javax.swing.*;
//
//public class Bakai {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        String name = "Акылбеков Бакай Акылбекович";
//        String u = "КГУСТА";
//        int age = 19;
//        char student = '3';
//        String g = "UCT-3-20";
//        String text = "Студент: "+ name;
//        text = text + "\n" + "Университет: " + u;
//        text = text + "\n" + "Группа: " + g;
//        text = text + "\n" + "Возрасть: " + age +"лет";
//        text = text + "\n"+ "курс: " + student;
//        JOptionPane.showMessageDialog(null, text);
//
//    }
//}

import java.util.Scanner;

public class Bakai
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int a = amount * 10 / 100;
        int january = amount - a;

        int b = january * 10 / 100;
        int february = january - b;

        int c = february * 10 / 100;
        int march = february - c;

        int d = march * 10 / 100;
        int april = march - d;

        int e = april * 10 / 100;
        int may = april - e;

        int f = may * 10 / 100;
        int june = may - f;

        System.out.println(june - 1);
    }
}
//import java.util.Scanner;

//public class Bakai{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//
//        for (int i=0; i<6; i++) {
//            amount -= (amount / 100 * 10);
//        }
//        System.out.println((int)amount);
//    }
//}

//import java.util.Scanner;

//public class Bakai
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
////введите код сюд
//
//        for (int x=0; x<6; x++) {
//            amount = (int)(amount-(amount*0.1));
//        }
//        System.out.println (amount);
//    }
//}
//import java.util.Scanner;
//public class Bakai
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//        double a = (double) amount;
//        for (int x = 0; x < 6; x++){
//            a = (a - a * 10 / 100);
//            int c = (int) a;
//            System.out.println(c);
//        }
//    }
//}
