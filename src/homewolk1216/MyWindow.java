package homewolk1216;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 开发一个登陆窗体，包括用户名，密码以及提交和重置的按钮，当用户输入用户名mr，密码 mr_soft时弹出登陆成功提示对话框
public class MyWindow extends JFrame {
    public static void main(String[] args) {
        MyWindow my = new MyWindow();
        my.setVisible(true);
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my.setSize(300,300);
    }
    public MyWindow(){
        super();
        setTitle("myFirst Windows");
        getContentPane().setLayout(null);
        final JLabel user = new JLabel();
        user.setText("用户名:");
        user.setBounds(38,13,60,15);
        getContentPane().add(user);
        final JTextField userText = new JTextField();
        userText.setBounds(89, 13, 180, 31);
        getContentPane().add(userText);
        final JLabel pass = new JLabel();
        pass.setText("密码:");
        pass.setBounds(39, 50, 320, 31);
        getContentPane().add(pass);
        final JPasswordField passText = new JPasswordField();
        passText.setBounds(89, 50, 180, 31);
        getContentPane().add(passText);
        final JButton submitButton = new JButton();

        submitButton.setText("提交");
        submitButton.setBounds(50,100,60,40);
        getContentPane().add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userText.getText().trim().length() == 0 || new String(passText.getPassword()).trim().length() == 0){
                    JOptionPane.showMessageDialog(null,"用户名不允许为空");
                    return;
                }
                if(userText.getText().trim().equals("mr") && new String(passText.getPassword()).trim().equals("mr_soft")){
                    JOptionPane.showMessageDialog(null,"登陆成功");
                }else{
                    JOptionPane.showMessageDialog(null,"用户名或密码错误");
                }
            }
        });
        final JButton resetButton = new JButton();
        resetButton.setText("重置");
        resetButton.setBounds(150,100,60,40);
        getContentPane().add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });

        /*
        final JFrame frame = new JFrame();
        frame.setVisible(false);
        frame.setSize(170,170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel newWin = new JLabel();
        newWin.setText("登陆成功");
        frame.getContentPane().add(newWin);
        */

    }
    /*
    private class ButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();   // 获取触发此次事件的按钮对象
            String buttonName = e.getActionCommand();
            if(buttonName.equals("mr") && )
        }
    }

     */
}
