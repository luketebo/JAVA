package term;

import homewolk1021.box.Box;
import homewolk1105.test.B;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class Culcaltor extends JFrame {
    public static void main(String[] args) {
        Culcaltor cul = new Culcaltor();
        cul.setVisible(true);
        cul.setSize(650, 450);

    }

    public Culcaltor() {
        super();
        // 整体框架 需要一个容器，原来是这么做的，
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // 设置整个容器的布局

        setTitle("计算器");
        setBounds(0, 0, 430, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel viewPanel = new JPanel();
        //  getContentPane().setLayout(null);  // 禁用布局器
        getContentPane().add(viewPanel, BorderLayout.NORTH);
        viewPanel.setBorder(BorderFactory.createTitledBorder("面板1"));
        JTextField textField = new JTextField();
        textField.setEditable(true);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setColumns(80);   //columns 列
        viewPanel.add(textField);

        // 面板2
        final JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createTitledBorder("面板2"));
        final GridLayout gridLayout = new GridLayout(0, 5);   //row 行 col 列
        gridLayout.setVgap(5);
        gridLayout.setHgap(5);
        buttonPanel.setLayout(gridLayout);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        String[][] names = {{"1", "2", "3", "/", "C"}, {"4", "5", "6", "*", "退格"},
                {"7", "8", "9", "-", "1/x"}, {"0", "+/-", ".", "+", "="}};
        JButton[][] buttons = new JButton[6][6];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                buttons[row][col] = new JButton(names[row][col]);
                buttonPanel.add(buttons[row][col]);
            }
        }
        final JLabel leftLabel = new JLabel();  //创建左键占位符  干嘛用？
        leftLabel.setPreferredSize(new Dimension(10, 0));
        getContentPane().add(leftLabel, BorderLayout.WEST);
        final JLabel rightLabel = new JLabel();
        rightLabel.setPreferredSize(new Dimension(10, 0));
        getContentPane().add(rightLabel, BorderLayout.EAST);
        // 显示两个文本框

        final JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("面板3"));
        getContentPane().add(rightPanel, BorderLayout.EAST);  //这才是面板
        /*
        JTextField right_text = new JTextField();
        right_text.setEditable(true);
        right_text.setHorizontalAlignment(JTextField.RIGHT);
        right_text.setColumns(40);   //columns 列
        rightPanel.add(right_text,BorderLayout.NORTH);
        */

        JTextArea right_text_show = new JTextArea(15, 20);  // 行 列
        // 水平  right_text_show.setHorizontalAlignment(SwingConstants.RIGHT);
        // right_text_show.setColumns(40);
        // right_text_show.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //right_text_show.setBounds(40,40,90,90);
       // right_text_show.setBounds(300,300,90,90);
        rightPanel.add(right_text_show,BorderLayout.NORTH);
        //显示按钮
        /*
        String[] button_rs = {"保存", "查看", "清除"};
        final JButton[] button_rb = new JButton[3];
        for (int i = 0; i < 3; i++) {
            button_rb[i] = new JButton(button_rs[i]);
            rightPanel.add(button_rb[i]);
        }
        */

        final JButton button_rb_1 = new JButton("保存");
        final JButton button_rb_2 = new JButton("查看");
        final JButton button_rb_3 = new JButton("清除");
        /*
        button_rb_1.setBounds(400,400,30,30);
        button_rb_2.setBounds(430,400,30,30);
        button_rb_3.setBounds(460,400,30,30);
         */
        rightPanel.add(button_rb_1,BorderLayout.WEST);
        rightPanel.add(button_rb_2,BorderLayout.CENTER);
        rightPanel.add(button_rb_3,BorderLayout.EAST);
       // button_rb[0] = new JButton(button_rs[0]);


        //  rightPanel.add(button_rb[0]);


    }

}
