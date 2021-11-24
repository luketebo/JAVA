package homewolk1112.computer;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Computer com = new Computer();
        Scanner read = new Scanner(System.in);
        System.out.println("please input the number ");
        int a = read.nextInt();
        int b = read.nextInt();
        try{
            com.check(a,b);
        }catch (MyException e){
            e.getMsg();
        }
        com.max(a,b);

    }
}
