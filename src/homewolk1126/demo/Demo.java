package homewolk1126.demo;
import java.io.*;

public class Demo {
    public static void main(String[] args) {
        File fil = new File("D:\\","demo.txt");
        try{
            byte []b = new byte[512];
            FileInputStream fis = new FileInputStream(fil);
            int rs = 0;
            String s = null;
            System.out.println("The text count: ");
            while((rs = fis.read(b,0,512))>0){
                s = new String(b,0,512);
                System.out.println(s);
            }
            assert s != null;
            char []ch = s.toCharArray();
            int ch_length = ch.length;
            int []chl = new int[53];

            for(int i =0;i<53;i++){
                chl[i] = 0;

            }

            for (char value : ch) {
                System.out.print(value + " ");
            }

            long localtime = System.currentTimeMillis();
            System.out.println();
            for (char c : ch) {

                if (c >= 'a' && c <= 'z') {

                    int vb = c - 'a' ;
                    chl[vb]++;
                }
                if(c >= 'A' && c <= 'Z'){
                    int va = c -'A' ;
                    chl[va+26]++;
                }
            }
            System.out.println("show the max:" );
            int max = chl[0];
            int n = 0;
            for(int i = 0;i<53;i++){
                if(max < chl[i]){
                    max = chl[i];
                    n = i;
                }
            }
            long endtime = System.currentTimeMillis();

            if(n >= 26){
                System.out.println("the max:" + (char)('A' + n - 26) + " "+ max);
            }
            if( n <=26 )
            {
                System.out.println("the max : " + (char)('a' + n) + " " + max);
            }
            System.out.println("the program time: " + (endtime - localtime));


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
