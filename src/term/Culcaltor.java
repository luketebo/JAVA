package term;

import homewolk1105.test.B;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class Culcaltor extends JFrame{
    public static void main(String[] args) {
        Culcaltor cul = new Culcaltor();
        cul.setVisible(true);

    }
    public Culcaltor(){
        super();
        setTitle("计算器");
        setBounds(0,0,430,330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel viewPanel = new JPanel();
        getContentPane().add(viewPanel, BorderLayout.NORTH);
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setColumns(40);   //columns 列
        viewPanel.add(textField);
        final JPanel buttonPanel = new JPanel();
        final GridLayout gridLayout = new GridLayout(0,5);   //row 行 col 列
        gridLayout.setVgap(5);
        gridLayout.setHgap(5);
        buttonPanel.setLayout(gridLayout);
        getContentPane().add(buttonPanel,BorderLayout.CENTER);
        String[][] names = {{"1","2","3","/","C"},{"4","5","6","*","退格"},
                {"7","8","9","-","1/x"},{"0","+/-",".","+","="}};
        JButton[][] buttons = new JButton[6][6];
        for(int row = 0; row < 4;row++){
            for(int col = 0; col < 5;col++){
                buttons[row][col] = new JButton(names[row][col]);
                buttonPanel.add(buttons[row][col]);
            }
        }
        final JLabel leftLabel = new JLabel();  //创建左键占位符  干嘛用？
        leftLabel.setPreferredSize(new Dimension(10,0));
        getContentPane().add(leftLabel,BorderLayout.WEST);
        final JLabel  rightLabel = new JLabel();
        rightLabel.setPreferredSize(new Dimension(10,0));
        getContentPane().add(rightLabel,BorderLayout.EAST);
    }

}
