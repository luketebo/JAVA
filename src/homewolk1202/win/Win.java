package homewolk1202.win;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Win extends JFrame {
    public static void main(String[] args) {
        Win wi = new Win();
        wi.setVisible(true);
    }

    public Win() {
        super();
        setTitle("注册界面");
        setBounds(100, 100, 550, 270);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel user = new JLabel();
        user.setText("用户名");
        user.setBounds(38, 13, 60, 15);
        getContentPane().add(user);
        JTextField textField = new JTextField();
        textField.setBounds(89, 13, 180, 31);
        getContentPane().add(textField);
        final JLabel useradd = new JLabel();
        useradd.setText("最长14个英文或7个汉字");
        useradd.setBounds(280, 13, 200, 20);
        getContentPane().add(useradd);

        final JLabel tel = new JLabel();
        tel.setText("手机号");
        tel.setBounds(39, 50, 320, 31);
        getContentPane().add(tel);
        JTextField telField = new JTextField();
        telField.setBounds(89, 50, 320, 31);
        getContentPane().add(telField);


        final JLabel pass = new JLabel();
        pass.setText("密 码");
        pass.setBounds(40, 90, 320, 31);
        getContentPane().add(pass);
        JTextField passField = new JTextField();
        passField.setBounds(89, 90, 320, 31);
        getContentPane().add(passField);


        final JButton aButton = new JButton();
        aButton.setText("注册");
        aButton.setBounds(230, 130, 62, 32);
        getContentPane().add(aButton);
    }
}
