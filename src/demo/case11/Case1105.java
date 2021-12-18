package demo.case11;

import javax.swing.*;
import java.awt.*;

public class Case1105 extends JFrame {
    public static void main(String[] args) {
        Case1105 frame = new Case1105();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Case1105() {
        //  有一个问题哈，是我的原因吗？ 为啥子呀，每一次打开都是没有东西，都需要去拖动才会显示
        super();
        // 网格布局器当中行列设计之间的关系   优先 行 然后才是 列
        final GridLayout gridLayout = new GridLayout(4,0);   // 我忘了设置这个网格布局器的风格了
        gridLayout.setHgap(30);
        gridLayout.setVgap(30);
        Container panel = getContentPane();
        panel.setLayout(gridLayout);
        String[][] names = {{"1", "2", "3", "+"}, {"4", "5", "6", "-"}, {"7", "8", "9", "*"}, {".", "0", "=", "/"}};
        JButton[][] buttons = new JButton[4][4];
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names.length; col++) {
                buttons[row][col] = new JButton(names[row][col]);
                panel.add(buttons[row][col]);
            }
        }

    }

}
