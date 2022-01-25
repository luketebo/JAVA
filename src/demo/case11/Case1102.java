package demo.case11;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Case1102 extends JFrame {
    public static void main(String[] args) {
        Case1102 frame = new Case1102();
        frame.setVisible(true);
    }

    public Case1102() {
        super();
        setTitle("登陆窗口");
        setBounds(100, 100, 260, 210);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        label.setForeground(new Color(255,0,0));
        label.setFont(new Font("",Font.BOLD,18));
        label.setBounds(39,28,170,36);
        getContentPane().add(label);
        final JLabel usernameLabel = new JLabel();
        usernameLabel.setText("用户名： ");
        usernameLabel.setBounds(38,83,60,15);
        getContentPane().add(usernameLabel);
        JTextField textField = new JTextField();
        textField.setBounds(89,80,120,121);
        getContentPane().add(textField);
        final JLabel passwordLabel = new JLabel();
        passwordLabel.setText("密 码：");
        passwordLabel.setBounds(39,107,60,15);
        getContentPane().add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(89,104,120,21);
        getContentPane().add(passwordField);
        final JButton exitButton = new JButton();
        exitButton.setText("退出");
        exitButton.setBounds(141,131,68,23);
        getContentPane().add(exitButton);
        final JButton landButton = new JButton();
        landButton.setText("登陆");
        landButton.setBounds(167,131,68,23);
        getContentPane().add(landButton);

    }
}
