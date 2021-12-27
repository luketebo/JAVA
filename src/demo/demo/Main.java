package demo.demo;

import term.RoundRectButton;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        Main af = new Main();
        af.setVisible(true);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Main(){
        setLayout(null);
        RoundRectButton a = new RoundRectButton("aaa");
        a.setSize(20,30);
        getContentPane().add(a);
    }
}
