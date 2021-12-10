package term;

import javax.swing.*;

public class Term extends JFrame {
    public static void main(String[] args) {
        Term t = new Term();
        t.setVisible(true);
    }
    public Term(){
        super();
        setTitle("计算器");
        setBounds(100,100,230,230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
