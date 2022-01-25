package homewolk1223;
// 什么叫用main创建一个窗体，然后后用MVCWindow 初始化窗体

import javax.swing.*;

public class Example extends JFrame {
    public static void main(String[] args) {
        Example frame = new Example();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
