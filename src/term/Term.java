package term;

import homewolk1105.test.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Term extends JFrame {
    //若想要实现添加到同一JFrame中且不覆盖，不可直接添加，需要先将要添加的JPanel添加到一个JPanel中，再将该JPanel添加到JFrame中

    public static void main(String[] args) {
        Term t = new Term();
        t.setVisible(true);
        t.setSize(890, 524);
    }

    public Term() {
        super();
        Container c = getContentPane();
        setTitle("计算器");
        setBounds(0, 0, 200, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel jp = new JPanel();
        // jp.setBorder(BorderFactory.createTitledBorder("面板0"));
        // 面板1
        final JPanel viewPanel = new JPanel();
        viewPanel.setPreferredSize(new Dimension(450, 450));
        // viewPanel.setBorder(BorderFactory.createTitledBorder("面板1"));
        // 面板 1.1
        final JPanel viewPanel1 = new JPanel();
        viewPanel1.setPreferredSize(new Dimension(400, 85));
        // viewPanel1.setBorder(BorderFactory.createTitledBorder("面板1.1"));
        final JTextField one = new JTextField();
        one.setPreferredSize(new Dimension(165, 65));
        one.setEditable(false);
        final JTextField two = new JTextField();
        two.setPreferredSize(new Dimension(50, 65));
        two.setEditable(false);
        final JTextField three = new JTextField();
        three.setPreferredSize(new Dimension(165, 65));
        three.setEditable(false);
        viewPanel1.add(one);
        viewPanel1.add(two);
        viewPanel1.add(three);

        final JPanel viewPanel2 = new JPanel();
        viewPanel2.setPreferredSize(new Dimension(400, 350));
        // viewPanel2.setBorder(BorderFactory.createTitledBorder("面板1.2"));
        final GridLayout gridLayout = new GridLayout(0, 5);   //row 行 col 列
        gridLayout.setVgap(20);
        gridLayout.setHgap(20);
        viewPanel2.setLayout(gridLayout);
        //getContentPane().add(viewPanel2, BorderLayout.CENTER);
        String[][] names = {{"1", "2", "3", "/", "C"}, {"4", "5", "6", "*", "退格"},
                {"7", "8", "9", "-", "1/x"}, {"0", "+/-", ".", "+", "="}};
        JButton[][] buttons = new JButton[6][6];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                buttons[row][col] = new JButton(names[row][col]);
                buttons[row][col].addActionListener(new ListenerNumber());

                viewPanel2.add(buttons[row][col]);
            }
        }


        viewPanel.add(viewPanel1);
        viewPanel.add(viewPanel2);

        // 面板2
        final JPanel secondPanel = new JPanel();
        secondPanel.setPreferredSize(new Dimension(400, 450));
        // secondPanel.setBorder(BorderFactory.createTitledBorder("面板2"));

        final JPanel secondPanel1 = new JPanel();
        secondPanel1.setPreferredSize(new Dimension(400, 85));
        // secondPanel1.setBorder(BorderFactory.createTitledBorder("面板2.1"));
        final JTextField left_one = new JTextField();
        left_one.setPreferredSize(new Dimension(380, 65));
        left_one.setEditable(false);
        secondPanel1.add(left_one);


        final JPanel secondPanel2 = new JPanel();
        secondPanel2.setPreferredSize(new Dimension(400, 284));
        //  secondPanel2.setBorder(BorderFactory.createTitledBorder("面板2.2"));
        final JTextArea left_two = new JTextArea(25, 35);
        secondPanel2.add(left_two);


        final JPanel secondPanel3 = new JPanel();
        secondPanel3.setPreferredSize(new Dimension(400, 75));
        //  secondPanel3.setBorder(BorderFactory.createTitledBorder("面板2.3"));

        final FlowLayout gridLayout1 = new FlowLayout();
        gridLayout1.setVgap(4);
        gridLayout1.setHgap(40);
        secondPanel3.setLayout(gridLayout1);

        String[] ad = {"保存", "查看", "清除"};
        JButton[] ad_buttons = new JButton[3];
        for (int i = 0; i < 3; i++) {
            ad_buttons[i] = new JButton(ad[i]);
            ad_buttons[i].addActionListener(new ListenerNumber());
            ad_buttons[i].setPreferredSize(new Dimension(80, 55));
            secondPanel3.add(ad_buttons[i]);
        }


        secondPanel.add(secondPanel1);
        secondPanel.add(secondPanel2);
        secondPanel.add(secondPanel3);
        jp.add(viewPanel, BorderLayout.WEST);
        jp.add(secondPanel, BorderLayout.EAST);
        getContentPane().add(jp);

    }

    /*
    这个方法返回的是事件源组件的“命令” ， 这个“命令” 实际上就是事件源组件上的“Label（标签）字符串” ，

    比如：Button bt = new Button("按钮1") ；

    那么如果我们为这个按钮添加了一个点击事件监听器的话（ActionListener），那么在public void actionPerformed(ActionEvent e)方法中，

    如果调用getActionCommand（）方法的话，返回的就是“按钮1” ；
     */
    class ListenerNumber implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //获取事件源文字
            JButton button = (JButton) e.getSource();
            String buttonName = e.getActionCommand();
            switch (buttonName) {
                case ".":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0": {
                    input(buttonName);
                    break;
                }
                case "-":
                case "+":
                case "*":
                case "/": {
                    input_sign(buttonName);
                    break;
                }
                case "+/-":
                case "1/x": {
                    change(buttonName);
                    break;
                }
                case "c":
                case "退格": {
                    clear(buttonName);
                    break;
                }
                case "=": {
                    out(buttonName);
                    break;
                }
                case "保存":
                    ab_save(buttonName);
                    break;
                case "查看":
                    ab_show(buttonName);
                    break;
                case "清除":
                    ab_clear(buttonName);
                    break;


            }
        }
    }

    public void input(String num) {

    }

    public void input_sign(String sign) {

    }

    public void out(String equal) {

    }

    public void clear(String n) {

    }

    public void change(String n) {

    }

    public void ab_clear(String buttonName) {
    }

    public void ab_save(String buttonName) {
    }

    public void ab_show(String buttonName) {
    }


}
