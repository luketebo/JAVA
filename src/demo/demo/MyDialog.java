package demo.demo;

import javax.swing.*;

class MyDialog extends JDialog {
    public MyDialog(int x, int y) {
        setTitle("静夜思");
        JLabel jl = new JLabel("<html><body>床前明月光,疑是地上霜.<br />举头望明月,低头思故乡.<br /></div></body></html>");
        add(jl);
        setSize(200, 40);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(x, y);
        setVisible(true);
        setAlwaysOnTop(true);
    }
}
