package demo;
import java.io.*;
public class Demo {
    public static void main(String[] args) {
        File a = new File("C:\\","my.txt");
        System.out.println("file path:" + a.getPath());
        System.out.println("file absolutist:" + a.getAbsolutePath());

    }
}
