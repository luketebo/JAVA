package homewolk1112.myexception;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner read = new Scanner(System.in);
        System.out.println("please input the number");
        int a = read.nextInt();
        try{
            stu.speak(a);
        }catch(MyException e){
            e.getMsg();
        }
    }
}
