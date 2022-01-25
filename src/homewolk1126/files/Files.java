package homewolk1126.files;
import java.io.*;
public class Files {
    public static void main(String[] args) {
        File  a = new File("D:\\");
        File  f = new File(a,"demo.txt");
        try{
            byte[] bytes = new byte[512];
            FileInputStream fis = new FileInputStream(f);
            int rs = 0;
            System.out.println("The content of  demo is :");
            while((rs=fis.read(bytes,0,512))>0){
                String s = new String(bytes,0,rs);
                System.out.println(s);
            }
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
