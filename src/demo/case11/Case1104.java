package demo.case11;

import javax.swing.*;
import java.awt.*;

public class Case1104 extends JFrame {
    public static void main(String[] args) {
        Case1104 frame = new Case1104();
        frame.setVisible(true);
    }
    public Case1104(){
        super();
        final BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        Container panel = getContentPane();   // 获取容器对象
        panel.setLayout(borderLayout);

        final JButton aButton = new JButton();
        aButton.setText("按钮A");
        panel.add(aButton,BorderLayout.NORTH);

        final JButton bButton = new JButton();
        bButton.setText("按钮B");
        panel.add(bButton,BorderLayout.WEST);

        final JButton cButton = new JButton();
        cButton.setText("按钮C");
        panel.add(cButton,BorderLayout.CENTER);

        final JButton dButton = new JButton();
        dButton.setText("按钮D");
        panel.add(dButton,BorderLayout.EAST);

        final JButton eButton = new JButton();
        eButton.setText("按钮E");
        panel.add(eButton,BorderLayout.SOUTH);


    }
}
