package demo.case10;
import java.io.*;
public class Case1010 {
    public static void main(String[] args) {
        File file = new File("D:\\","demo.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("请输入：");
            String str = br.readLine();
            System.out.println("您输入的内容是：" + str);
            FileWriter fos = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fos);
            bw.write(str);
            br.close();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
