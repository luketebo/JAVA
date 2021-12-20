package demo.case11;

import javax.swing.*;
import java.awt.*;

public class Case1109 extends JFrame {
    public static void main(String[] args) {
        Case1109 frame = new Case1109();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,300);
    }
    public Case1109(){
        super();
        final JLabel label = new JLabel();
        label.setBounds(0,0,5120,2880);
        label.setText("欢迎来到二次元");
        label.setFont(new Font("", Font.BOLD,22)); // 设置字体
        label.setHorizontalAlignment(JLabel.CENTER);    // 设置标签内容剧中显示
        label.setIcon(new ImageIcon("C:\\Users\\yang\\Desktop\\yang\\0.jpg"));  // 这个好像就就可以显示图片了
        // 我该怎么添加我的文字呢？
        label.setHorizontalTextPosition(JLabel.CENTER);   // 设置文字相对图片在水平方向的显示位置
        label.setVerticalTextPosition(JLabel.BOTTOM);   // 设置文字相对图片在垂直方向的显示位置
        getContentPane().add(label);
    }
}
