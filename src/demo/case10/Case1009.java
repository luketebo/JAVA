package demo.case10;
import java.io.*;
import java.util.*;
public class Case1009 {
    public static void main(String[] args) {
        PrintStream ps;
        try{
            File file  = new File("D:\\","demo.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            ps = new PrintStream(new FileOutputStream(file));
            Random r = new Random();
            int rs = 0;
            for(int i = 0;i<5;i++){
                rs = r.nextInt();
                ps.println(rs + "\t");
            }
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
