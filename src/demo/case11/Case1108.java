package demo.case11;

import javax.swing.*;
import java.awt.*;

public class Case1108 extends JFrame {
    public static void main(String[] args) {
        Case1108 frame = new Case1108();
        frame.setSize(360,360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Case1108(){
        super();
        final JScrollPane frameScrollPane = new JScrollPane();
        frameScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(frameScrollPane);
        final JPanel framePanel = new JPanel();
        framePanel.setLayout(new BorderLayout());
        frameScrollPane.setViewportView(framePanel);
        final JPanel typePanel = new JPanel();
        framePanel.add(typePanel,BorderLayout.NORTH);
        final JLabel typeLabel = new JLabel();
        typeLabel.setText("类别");
        typePanel.add(typeLabel);
        JScrollPane typeScrollPane = new JScrollPane();
        typeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        typePanel.add(typeScrollPane);
        String[] items = {"幽默短信","新年祝福","生日祝福","新婚祝福"};
        JList list = new JList();
        list.setVisibleRowCount(3);
        typeScrollPane.setViewportView(list);
        final JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(110,0));
        typePanel.add(label);
        final JPanel contentPanel = new JPanel();
        framePanel.add(contentPanel);
        final JLabel contentLabel = new JLabel();
        contentLabel.setText("内容");
        contentPanel.add(contentLabel);
        JScrollPane contentScrollPanel = new JScrollPane();
        contentScrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        contentPanel.add(contentScrollPanel);
        JTextArea textArea = new JTextArea();
        textArea.setRows(3);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        contentScrollPanel.setViewportView(textArea);
    }
}
