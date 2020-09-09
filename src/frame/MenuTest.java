package frame;
import javax.swing.*;
import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
    //    meniu();
        fr();
    }

    private static void meniu() {
        while (true) {
            System.out.println("introdu:");
            Scanner s = new Scanner(System.in);
            int optiune = s.nextInt();
            if (optiune == 1) {
                System.out.println("da 1");
            } else if (optiune == 2) {
                System.out.println("da 2");
            } else if (optiune == 3) {
                System.out.println("da 3");
            } else if (optiune == 0) break;
        }
    }
    private static void fr()
    {
            JMenu menu, submenu;
            JMenuItem i1, i2, i3, i4, i5;
            JFrame f= new JFrame("Menu and MenuItem Example");
                JMenuBar mb=new JMenuBar();
                menu=new JMenu("Menu");
                submenu=new JMenu("Sub Menu");
                i1=new JMenuItem("Item 1");
                i2=new JMenuItem("Item 2");
                i3=new JMenuItem("Item 3");
                i4=new JMenuItem("Item 4");
                i5=new JMenuItem("Item 5");
                menu.add(i1); menu.add(i2); menu.add(i3);
                submenu.add(i4); submenu.add(i5);
                menu.add(submenu);
                mb.add(menu);
                f.setJMenuBar(mb);
                f.setSize(400,400);
                f.setLayout(null);
                f.setVisible(true);

            }

    }

