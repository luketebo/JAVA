package demo.case10;
import java.io.*;
public class Case1007 {
    public static void main(String[]args){
        File filein = new File("D:\\","demo.txt");
        File fileout = new File("D:\\","dest.txt");
        FileInputStream fis = null;
        try{
            if(!filein.exists()){
                try {
                    filein.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(!fileout.exists()){
                try {
                    fileout.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fis = new FileInputStream(filein);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(fileout,true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            InputStreamReader in = new InputStreamReader(fis);
            OutputStreamWriter out = new OutputStreamWriter(fos);
            int is = 0;
            while(true){
                try {
                    if (!((is = in.read())!= -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                out.write(is);
            }
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
