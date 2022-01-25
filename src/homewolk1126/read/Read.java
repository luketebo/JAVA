package homewolk1126.read;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Read {
    public static void main(String[] args) {
        File fi = new File("D:\\","demo.txt");
        File fb = new File("D:\\","dest.txt");
        try{
            byte []b = new byte[100];
            FileInputStream fis = new FileInputStream(fi);
            int rs = 0;
            System.out.println("The text content:");
            String s = null;
            while((rs = fis.read(b,0,100))>0){
               s = new String(b,0,rs);
                System.out.println(s);
            }
            FileOutputStream fos = new FileOutputStream(fb);
            fos.write(b,0,100);
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
