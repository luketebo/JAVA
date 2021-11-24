package homewolk1112.number;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Number num = new Number();
        Scanner read = new Scanner(System.in);
        System.out.println("please input the number");
        int a = read.nextInt();
        int b = read.nextInt();
        try{
            num.check(a,b);
        }catch (MyException e){
            e.getMsg();
        }
        num.count(a,b);
    }

}
