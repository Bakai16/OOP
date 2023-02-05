import javax.swing.*;
public class JavaApplication2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double x, y, z, d;
        String title = "Симтеиа вложения";
        String text = "резултать проверки";
        int type=0;
        x = Double.parseDouble(JOptionPane.showInputDialog("Вести целое число:"));
        if (x<0)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text ="Веденная число меньше 0";
        }
        else if (0<x & x<10)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text = "Веденная число больше 0, меньше 10!";
        }
        else if (10<x & x<100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text ="Веденная число больше 10, меньше 100!";

        }
        else if (x>100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 100!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);
        y = Double.parseDouble(JOptionPane.showInputDialog("Вести целое число:"));
        if (y<0)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text ="Веденная число меньше 0";
        }
        else if (0<y & y<10)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 0, меньше 10!";
        }
        else if (10<y & y<100)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text =" Веденная число больше 10, меньше 100!";

        }
        else if (y>100)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 100!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);
        z = Double.parseDouble(JOptionPane.showInputDialog("Вести целое число:"));
        if (z<0)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text ="Веденная число меньше 0";
        }
        else if (0<z & z<10)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 0, меньше 10!";
        }
        else if (10<z & z<100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text =" Веденная число больше 10, меньше 100!";

        }
        else if (z>100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 100!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);
        d = Double.parseDouble(JOptionPane.showInputDialog("Вести целое число:"));
        if (d<0)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text ="Веденная число меньше 0";
        }
        else if (0<d & d<10)
        {
            type=JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 0, меньше 10!";
        }
        else if (10<d & d<100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text =" Веденная число больше 10, меньше 100!";

        }
        else if (d>100)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text = " Веденная число больше 100!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);
    }

}
