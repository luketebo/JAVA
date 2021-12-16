package demo.case11;

import javax.swing.*;

public class Case1101 extends JFrame {
    public static void main(String[] args) {
        Case1101 frame = new Case1101();
        frame.setVisible(true);
    }
    public Case1101(){
        super(); // 继承父类的构造方法
        setTitle("利用JFrame类创建的窗体");  //设置标题
        setBounds(100,100,500,375);  // 设置窗体的显示位置以及大小
        getContentPane().setLayout(null);    // 设置为不采用任何布局器
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 设置窗体关闭按钮的动作作为退出
        // JFrame 是什么？
    }

}
