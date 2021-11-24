package homewolk1021.animal;
import java.util.*;
public class Animal {
    String name;
    int leg;
    int count;
    void setleg(){
        Scanner read = new Scanner(System.in);
        System.out.println("please input the leg number");
        leg = read.nextInt();
    }
    void getleg(){
        System.out.println("the leg:" + leg);
    }
    void setname(){
        Scanner read = new Scanner(System.in);
        System.out.println("please input the name");
        name = read.nextLine();
    }
    void getname(){
        System.out.println("the name:" + name);
    }
    void setcount(){
        Scanner read = new Scanner(System.in);
        System.out.println("please input the count");
        count = read.nextInt();
    }
    void getcount(){
        System.out.println("the count:" + count);
    }
}
