package homewolk1126.files;

import java.io.*;

public class Files02 {
    public static void main(String[] args) {
        File a = new File("D:\\");
        File f = new File(a, "demo.txt");
        try {
            byte[] bytes = new byte[512];
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            System.out.println("The content of  demo is :");
            int rs;
            while ((rs = isr.read()) != -1) {
                System.out.print((char) rs + " ");
            }
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
