package demo.case11;

import javax.swing.*;

public class Case1110 extends JFrame {
    public static void main(String[] args) {
        Case1110 frame = new Case1110();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
    }
    public Case1110(){
        super();
        final JLabel orderLabel = new JLabel();
        orderLabel.setBounds(59,55,60,15);
        getContentPane().add(orderLabel);
        final JTextField orderTextField = new JTextField();
        //   我属实是没看懂这个的意思了 焯  orderTextField.setText(stock.getOrderId);
        orderTextField.setBounds(114,50,164,25);
        getContentPane().add(orderTextField);
        orderTextField.setColumns(10);
    }
}
