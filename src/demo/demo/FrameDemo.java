package demo.demo;

import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class FrameDemo extends JFrame implements ActionListener {
    JButton jb;

    public FrameDemo() {
        jb = new JButton("   <<静夜思>>   ");
        jb.addActionListener(this);
        System.out.print("杨昌松帅");
        JPanel jp = new JPanel();
        jp.add(jb);

        add(jp);
        // 窗口属性的设置
        setTitle("Frame窗口");// 标题
        setSize(256, 100);// 窗口大小
        setLocationRelativeTo(null);// 窗口居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FrameDemo().setVisible(true);// 创建窗口实例, 并让窗口可见
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 计算弹出框的位置
        int x = jb.getLocationOnScreen().x + jb.getWidth() / 2 - 100;
        int y = jb.getLocationOnScreen().y + jb.getHeight();
        MyDialog md = new MyDialog(x, y);
        // 多线程
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 40; i < 200; i += 2) {
                    md.setSize(i, i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t.start();//启动线程
    }
}
