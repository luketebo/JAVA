package demo.case10;
import java.io.*;
public class Case1008 {
    public static void main(String[] args) {
        try{
            FileReader fr;
            fr = new FileReader("D:\\demo.txt");
            File file = new File("D:\\dest.txt");
            FileWriter fos = new FileWriter(file);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fos);
            String str = null;
            while((str = br.readLine()) != null){
                bw.write(str + "\n");
            }
            br.close();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
