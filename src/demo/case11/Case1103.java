package demo.case11;

import javax.swing.*;
import java.awt.*;

public class Case1103 extends JFrame {
    public static void main(String[] args) {
        Case1103 frame = new Case1103();
        frame.setVisible(true);
    }

    public Case1103() {
        super();  // 为什么继承父类的构造方法
        // 就是初始窗体的大小怎么设置？这个我不晓得
        final FlowLayout flowLayout = new FlowLayout(); // 这是一个布局器呀
        flowLayout.setHgap(10);                         // 设置组件的水平间距和垂直间距
        flowLayout.setVgap(10);
        flowLayout.setAlignment(FlowLayout.LEFT);   // 设置组件的对齐方式
        // 获取内容面板   我这个是添加到JFrame 当中的，设置这个窗体
        getContentPane().setLayout(flowLayout);     // 设置组件容器采用布局管理器   书上给的代码，都是直接getContentPane(),这个是怎么工作的？
        final JButton aButton = new JButton();
        aButton.setText("按钮A");
        getContentPane().add(aButton);
        final JButton bButton = new JButton();
        bButton.setText("按钮B");
        getContentPane().add(bButton);
        final JButton cButton = new JButton();
        cButton.setText("按钮C");
        getContentPane().add(cButton);


    }
}
