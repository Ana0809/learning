package frame;
import java.awt.*;
import java.awt.event.*;
public class FrameTest {
    public static void main(String[] args) {
        Frame f=new Frame("ActionListener Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50, 150,20);
       final Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               dostuff();
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    private static void dostuff(){
        int a=4;
        int b=2;
        int media = (a+b)/2;
        System.out.println(media);
    }
}