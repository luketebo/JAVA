package demo.case11;
// 因为大作业就是第六个案例，所以直接就是第七个案列

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Case1107 extends JFrame {
    public static void main(String[] args) {
        Case1107 frame = new Case1107();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Case1107() {
        super();
        setResizable(false);
        setTitle("拼图游戏");
        setBounds(100, 100, 570, 725);
        final JPanel topPanel = new JPanel();
        topPanel.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION, null, null));
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);
        final JLabel modelLabel = new JLabel();
        modelLabel.setIcon(new ImageIcon("C:\\Users\\yang\\Desktop\\0.jpg"));   // 设置标签显示的参考图片
        topPanel.add(modelLabel, BorderLayout.WEST);
        final JButton startButton = new JButton();
        startButton.setText("下一局");
      //  startButton.addActionListener(new StartButtonAction());  //为案件添加监听器
        topPanel.add(startButton, BorderLayout.CENTER);
        final JPanel centerPanel = new JPanel();
        centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        centerPanel.setLayout(new GridLayout(0, 3));
        getContentPane().add(centerPanel, BorderLayout.CENTER);
       // String[][] stochasticOrder = reorder();
        for(int row = 0 ; row < 3 ; row++) {
            for (int col = 0; col < 3; col++) {
                final JButton button = new JButton();
                button.setName(row + "" + col);
           //     button.setIcon(new ImageIcon(stochasticOrder[row][col]));
            //    if(stochasticOrder[row][col].equals("C:\\Users\\yang\\Desktop\\0.jpg"));
           //     emptyButton = button;
            //    button.addActionListener(new ImgButtonAction());
                centerPanel.add(button);
            }
        }

    }
}
