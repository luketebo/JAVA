package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demo {
    private JLabel label = new JLabel("所选文件路径：");
    private JTextField jtf = new JTextField(25);
    private JButton button = new JButton("浏览");

    public Demo() {
        JFrame jf = new JFrame("文件选择器");
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(jtf);
        panel.add(button);
        jf.add(panel);
        jf.pack();    //自动调整大小
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new MyActionListener());    //监听按钮事件
    }

    //Action事件处理
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            JFileChooser fc = new JFileChooser("F:\\");
            int val = fc.showOpenDialog(null);    //文件打开对话框
            if (val == fc.APPROVE_OPTION) {
                //正常选择文件   他这里只有选择文件的
                jtf.setText(fc.getSelectedFile().toString());
            } else {
                //未正常选择文件，如选择取消按钮
                jtf.setText("未选择文件");
            }
        }
    }

    public static void main(String[] args) {
        //new Demo();
        File file=new File("D://test.txt");
        try {
            Runtime.getRuntime().exec(
                    "rundll32 SHELL32.DLL,ShellExec_RunDLL "
                            + "Explorer.exe /select," + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
