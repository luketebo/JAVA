package homewolk1021.animal;

import java.util.Scanner;

public class Southtigger extends Tigger{
    int count;
    void setCount(){
        Scanner read = new Scanner(System.in);
        int c;
        System.out.println("please input the southtiger count");
        c = read.nextInt();
        count = c;
      //  System.out.println("southtiger count:" + count);

    }
    void getCount(){
        System.out.println("southtiger count:" + count);
    }

}
