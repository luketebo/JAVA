package homewolk1126.show;
import java.io.*;
public class Show {
    public static void main(String[] args) {
    File f = new File("D:\\","demo.txt");
    try {
        byte []bytes = new byte[512];
        FileInputStream fis = new FileInputStream(f);
        int rs = 0;
        System.out.println("The text content:");
        while((rs = fis.read(bytes,0,512))>0){
            String s = new String(bytes,0,rs);
            System.out.println(s);
        }
    }catch(Exception e){
        e.printStackTrace();
    }

    }
}
