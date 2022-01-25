package homewolk1021.box;
import java.util.*;
public class Box {
    private int length;
    private int width;
    private int height;
    Box(){
        Scanner read = new Scanner(System.in);
        int a=0,b=0,c=0;
        System.out.println("please input the length");
        a = read.nextInt();
        System.out.println("please input the width");
        b = read.nextInt();
        System.out.println("please input the height");
        c = read.nextInt();
        length = a;
        width = b;
        height = c;
    }
    void volume(Box vol){
        System.out.println("volume:" + vol.length*vol.width*vol.height);
    }
}
