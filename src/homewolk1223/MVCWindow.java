package homewolk1223;

import javax.swing.*;
import java.awt.*;

public class MVCWindow extends JFrame {
    public static void main(String[] args) {
        MVCWindow frame = new MVCWindow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public MVCWindow(){
        super();
        Container a = getContentPane();
        setTitle("计算三角形的面积");
        setSize(400,300);
        final JLabel side_A = new JLabel();
        side_A.setText("边长A");
        side_A.setBounds(20,20,40,40);
        getContentPane().add(side_A);
        final JTextField side_Text_A = new JTextField();
        side_Text_A.setBounds(80,20,40,40);
        getContentPane().add(side_Text_A);
        final JLabel side_B = new JLabel();
        side_B.setText("边长B");
        side_B.setBounds(140,20,40,40);
        getContentPane().add(side_B);
        final JTextField side_Text_B = new JTextField();
        side_Text_B.setBounds(200,20,40,40);
        getContentPane().add(side_Text_B);


        final JLabel side_C = new JLabel();
        side_C.setText("边长C");
        side_C.setBounds(260,20,40,40);
        getContentPane().add(side_C);
        final JTextField side_Text_C = new JTextField();
        side_Text_C.setBounds(320,20,40,40);
        getContentPane().add(side_Text_C);

    }

}
