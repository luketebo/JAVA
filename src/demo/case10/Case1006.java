package demo.case10;
import java.io.*;
public class Case1006 {
    public static void main(String[]arg){
        int rs = 0;
        File file = new File("D:\\","demo.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fis != null;  //断言？
        InputStreamReader isr = new InputStreamReader(fis);
        System.out.println("The content of Demo.txt");
        while(true){
            try {
                if (((rs = isr.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print((char)rs);
        }
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
