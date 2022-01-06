package term;

import homewolk1105.test.B;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Objects;
import term.DoRun.*;

public class Term<Public> extends JFrame {
    //若想要实现添加到同一JFrame中且不覆盖，不可直接添加，需要先将要添加的JPanel添加到一个JPanel中，再将该JPanel添加到JFrame中


    public static void main(String[] args) {

        JFrame frame = new JFrame("开屏广告");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DoRun());
        frame.setSize(500,500);
        //frame.setVisible(true);

        Term t = new Term();

        t.setSize(890, 524);
        int a = 0;
        while(a<5000){
            frame.setVisible(true);
            t.setVisible(false);
            a++;
        }
        t.setVisible(true);
        frame.setVisible(false);
        // 我要要写一个当动画做完之后，然后在显示我的计算器，这样一个流程
    }

    final JFrame jf = new JFrame();
    FileDialog fd = new FileDialog(jf, "打开文件");
    // 面板0
    final JPanel jp = new JPanel();

    // 面板1
    final JPanel viewPanel = new JPanel();
    // 面板 1.1
    final JPanel viewPanel1 = new JPanel();
    final JTextField one = new JTextField();
    final JTextField two = new JTextField();
    final JTextField three = new JTextField();
    // 1.2
    final JPanel viewPanel2 = new JPanel();
    JButton[][] buttons = new JButton[6][6];

    // 面板2
    final JPanel secondPanel = new JPanel();
    //2.1
    final JPanel secondPanel1 = new JPanel();
    final JTextField left_one = new JTextField();
    //2.2
    final JPanel secondPanel2 = new JPanel();
    final JTextArea left_two = new JTextArea(17, 35);
    //final JScrollPane scroll = new JScrollPane(left_two);
    //2.3
    final JPanel secondPanel3 = new JPanel();
    JButton[] ad_buttons = new JButton[3];

    // 我所需要的附加条件
    public boolean operatorPressed = false;   // 判断是否已经按下操作符
    public String storage;  // 用来存储我输入的字符串，方便加在一起
    public int first = 0;
    public int second = 0;


    public Term() {
        super();
        // Container c = getContentPane();
        setTitle("计算器");
        setBounds(0, 0, 200, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // jp.setBorder(BorderFactory.createTitledBorder("面板0"));
        // 面板1

        viewPanel.setPreferredSize(new Dimension(450, 450));
        // viewPanel.setBorder(BorderFactory.createTitledBorder("面板1"));

        viewPanel1.setPreferredSize(new Dimension(400, 85));
        // viewPanel1.setBorder(BorderFactory.createTitledBorder("面板1.1"));

        one.setPreferredSize(new Dimension(165, 65));
        one.setEditable(false);

        two.setPreferredSize(new Dimension(50, 65));
        two.setEditable(false);

        three.setPreferredSize(new Dimension(165, 65));
        three.setEditable(false);

        // 设置字体
        Font fb = new Font("微软雅黑", Font.BOLD, 26);

        one.setFont(fb);
        two.setFont(fb);
        three.setFont(fb);
        one.setBorder(BorderFactory.createLineBorder(Color.black));
        two.setBorder(BorderFactory.createLineBorder(Color.black));
        three.setBorder(BorderFactory.createLineBorder(Color.black));
        viewPanel1.add(one);
        viewPanel1.add(two);
        viewPanel1.add(three);


        viewPanel2.setPreferredSize(new Dimension(400, 350));
        // viewPanel2.setBorder(BorderFactory.createTitledBorder("面板1.2"));
        final GridLayout gridLayout = new GridLayout(0, 5);   //row 行 col 列
        gridLayout.setVgap(35);
        gridLayout.setHgap(15);
        viewPanel2.setLayout(gridLayout);
        Font f = new Font("宋体", Font.BOLD, 13);
        //getContentPane().add(viewPanel2, BorderLayout.CENTER);
        String[][] names = {{"1", "2", "3", "/", "C"}, {"4", "5", "6", "*", "退格"},
                {"7", "8", "9", "-", "sqrt"}, {"0", "+/-", ".", "+", "="}};

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                buttons[row][col] = new JButton(names[row][col]);
                buttons[row][col].addActionListener(new ListenerNumber());
                buttons[row][col].setFont(f);
                buttons[row][col].setMargin(new Insets(0,0,0,0));
                buttons[row][col].setBorder(new RoundBorder());
                buttons[row][col].setContentAreaFilled(false);
                buttons[row][col].setFocusPainted(false);
               // buttons[row][col].setBackground(new Background(new BackgroundFill(Color.GRAY ,new CornerRadii(10),new Insets(3))));
                viewPanel2.add(buttons[row][col]);
            }
        }


        viewPanel.add(viewPanel1);
        viewPanel.add(viewPanel2);


        secondPanel.setPreferredSize(new Dimension(400, 450));
        // secondPanel.setBorder(BorderFactory.createTitledBorder("面板2"));


        secondPanel1.setPreferredSize(new Dimension(400, 85));
        // secondPanel1.setBorder(BorderFactory.createTitledBorder("面板2.1"));

        left_one.setPreferredSize(new Dimension(380, 65));
        left_one.setEditable(false);
        left_one.setBorder(BorderFactory.createLineBorder(Color.black));
        secondPanel1.add(left_one);


        secondPanel2.setPreferredSize(new Dimension(400, 284));
        //  secondPanel2.setBorder(BorderFactory.createTitledBorder("面板2.2"));

        // 设置滚动条
        // scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // scroll.getViewport().add(left_two);
        left_two.setBorder(BorderFactory.createLineBorder(Color.black));

        secondPanel2.add(left_two);




        secondPanel3.setPreferredSize(new Dimension(400, 75));
        //  secondPanel3.setBorder(BorderFactory.createTitledBorder("面板2.3"));

        final FlowLayout gridLayout1 = new FlowLayout();
        gridLayout1.setVgap(4);
        gridLayout1.setHgap(40);
        secondPanel3.setLayout(gridLayout1);

        String[] ad = {"保存", "查看", "清除"};

        for (int i = 0; i < 3; i++) {
            ad_buttons[i] = new JButton(ad[i]);
            ad_buttons[i].addActionListener(new ListenerNumber());
            ad_buttons[i].setPreferredSize(new Dimension(80, 55));
            ad_buttons[i].setMargin(new Insets(0,0,0,0));
            ad_buttons[i].setBorder(new RoundBorder());
            ad_buttons[i].setContentAreaFilled(false);
            ad_buttons[i].setFocusPainted(false);
            secondPanel3.add(ad_buttons[i]);
        }

        left_one.setFont(fb);
        // left_two.setFont(fb);

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
                case "sqrt": {
                    change(buttonName);
                    break;
                }
                case "C":
                case "退格": {
                    clear(buttonName);
                    break;
                }
                case "=": {
                    out(buttonName);
                    break;
                }
                case "保存":
                    ab_save();
                    break;
                case "查看":
                    ab_show();
                    break;
                case "清除":
                    ab_clear();
                    break;


            }
        }


        public void input(String num) {
            // 输入第二遍数字式，格式化所有
            String a1 = new String(one.getText());
            String a2 = new String(two.getText());
            String a3 = new String(three.getText());
            String a4 = new String(left_one.getText());
            if (!Objects.equals(a1, "") && !Objects.equals(a2, "") && !Objects.equals(a3, "") && !Objects.equals(a4, "")) {
                one.setText("");
                two.setText("");
                three.setText("");
                left_one.setText("");
                operatorPressed = false;
                first = 0;
                second = 0;
            }
            if (!operatorPressed) {

                one.setText(one.getText() + num);

            } else {
                three.setText(three.getText() + num);
            }

        }

        public void input_sign(String sign) {
            two.setText(sign);
            operatorPressed = true;
        }

        public void out(String equal) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
            String s1 = new String(one.getText());
            String s2 = new String(two.getText());
            String s3 = new String(three.getText());
            // double 可以控制 输出For input String "0.5"
            Double a = Double.parseDouble(s1);
            Double b = Double.parseDouble(s3);
            switch (s2) {
                // append 不会进行覆盖
                case "+":
                    Double c = a + b;
                    String s = a + " + " + b + " = " + c;


                    left_one.setText(String.valueOf(c));
                    left_two.append(s + "                       " + formatter.format(calendar.getTime()) + "\r\n");
                    // left_two.setText("\n");
                    break;
                case "-":
                    Double h = a - b;
                    left_one.setText(String.valueOf(h));


                    left_two.append(String.valueOf(a) + " - " + String.valueOf(b) + " = " + String.valueOf(h) + "                       " + formatter.format(calendar.getTime()) + "\r\n");

                    break;
                case "*":
                    Double d = a * b;
                    left_one.setText(String.valueOf(d));
                    left_two.append(String.valueOf(a) + " * " + String.valueOf(b) + " = " + String.valueOf(d) + "                       " + formatter.format(calendar.getTime()) + "\r\n");

                    break;
                case "/":
                    Double e = a / b;
                    left_one.setText(String.valueOf(e));
                    left_two.append(String.valueOf(a) + " / " + String.valueOf(b) + " = " + String.valueOf(e) + "                       " + formatter.format(calendar.getTime()) + "\r\n");

                    break;
            }


        }

        public void clear(String n) {
            if (Objects.equals(n, "退格")) {
                if (!operatorPressed) {
                    StringBuilder sb = new StringBuilder(one.getText());
                    one.setText(sb.substring(0, sb.length() - 1));
                } else {
                    StringBuilder sa = new StringBuilder(three.getText());
                    three.setText(sa.substring(0, sa.length() - 1));

                }
            }
            if (Objects.equals(n, "C")) {
                one.setText("");
                two.setText("");
                three.setText("");
                left_one.setText("");
                operatorPressed = false;
                first = 0;
                second = 0;
            }
        }

        public void change(String n) {
            if (n.equals("+/-")) {
                if (!operatorPressed) { // 在没有按下符号键的情况
                    String a = "+";
                    String b = "-";
                    if (first == 0) {
                        String f1 = new String(one.getText());
                        one.setText(a + f1);
                    } else {
                        if (first % 2 == 0) {  // 偶数
                            String f2 = new String(one.getText());
                            String f21 = f2.substring(1, f2.length());
                            one.setText(b + f21);
                        } else {
                            String f3 = new String(one.getText());
                            String f31 = f3.substring(1, f3.length());
                            one.setText(a + f31);
                        }
                    }
                    first++;
                } else {
                    String a = "+";
                    String b = "-";
                    if (second == 0) {
                        String f1 = new String(three.getText());
                        three.setText(a + f1);
                    } else {
                        if (second % 2 == 0) {  // 偶数
                            String f2 = new String(three.getText());
                            String f21 = f2.substring(1, f2.length());
                            three.setText(b + f21);
                        } else {
                            String f3 = new String(three.getText());
                            String f31 = f3.substring(1, f3.length());
                            three.setText(a + f31);
                        }
                    }
                    second++;

                }
            } else {
                if (!operatorPressed) {
                    int a = Integer.parseInt(one.getText());
                    double b = Math.sqrt(a);
                    // 控制小数点位数
                    DecimalFormat df = new DecimalFormat("0.0");
                    one.setText(String.valueOf(df.format(b)));
                } else {
                    int a = Integer.parseInt(three.getText());
                    double b = Math.sqrt(a);
                    DecimalFormat df = new DecimalFormat("0.0");
                    three.setText(String.valueOf(df.format(b)));
                }
            }
        }

        // 清除
        public void ab_clear() {
            // 仅仅只是删除jTextArea 中的数据，整个文本的内容并没有发生改变
            left_two.setText("");
        }

        // 保存
        public void ab_save() {
            // 我需要把jTextArea 中的数据，读取到内存中，然后将这里的数据，写入文件里
            try {
                String area = left_two.getText();
                // System.out.println(area);
                File a = new File("D:\\test.txt");
                if (!a.exists()) {
                    a.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(a.getName(), true);
                fileWriter.write(area);

                fileWriter.close();
                //System.out.println("finish");
                left_two.append("finish");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // 查看
        public void ab_show() {
            fd.setVisible(true);
            String fileName = fd.getDirectory() + fd.getFile();
            // 找到后把的东西显示在文本框里面

            try {
                FileInputStream src = new FileInputStream(fileName);
                byte[] fn = new byte[0];
                try {
                    fn = new byte[src.available()];
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    src.read(fn);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                left_two.setText(new String(fn));
                try {
                    src.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }

    }

}
