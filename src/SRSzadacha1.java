
import javax.swing.*;
public class SRSzadacha1 {
    public static void main(String[] args) {
        //int size = 12;
        int size;

        String text = "Получить новый массив \n" ;
        size = Integer.parseInt(JOptionPane.showInputDialog(("Укажитье размер массива:")));

        int [] array = new int[size];
        int [] array2 = new int[size];
        int sum = 0;

        for ( int i = 0; i < size; i++ ) {
            //System.out.println(array[i]);
            array[i] =  1 + i;
            array2[i] = array[i];
            sum += array[i];
            text += array[i]+ " ";
        }
        JOptionPane.showMessageDialog(null, text );
        String text1 = "Получить новый массив, пятого элемента среднеарифметическим исходного массива: \n";
        array2[4] = sum / size;

        for ( int i = 0; i < size; i++ ) {
                text1 += array2[i] + " ";
        }
        //String text1 = array2[i] + " ";
        JOptionPane.showMessageDialog(null, text1);
    }
}
