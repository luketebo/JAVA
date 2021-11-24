package homewolk1021.animal;
import java.util.*;
public class Fish extends Animal{
    int count;
    void setCount(){
        Scanner read = new Scanner(System.in);
        int c;
        System.out.println("please input the fish count");
        c = read.nextInt();
        count = c;
      //  System.out.println("fish count:" + count);

    }
    void getCount(){
        System.out.println("fish count:" + count);
    }

}
