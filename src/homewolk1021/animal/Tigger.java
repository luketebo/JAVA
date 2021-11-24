package homewolk1021.animal;

import java.util.Scanner;

public class Tigger extends Animal{
    int count;
    void setCount(){
        Scanner read = new Scanner(System.in);
        int c;
        System.out.println("please input the tiger count");
        c = read.nextInt();
        count = c;
      //  System.out.println("tiger count:" + count);

    }
    void getCount(){
        System.out.println("tiger count:" + count);
    }
}
