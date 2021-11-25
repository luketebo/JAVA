package homewolk1118.user;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] u = new User[10];
        int choice = 0;
        int leng = 0;
        while(true){
            String name;
            String pass;
            System.out.println("please input the choice you want 1&2&3");
            int a = sc.nextInt();
            if(a == 3){
                break;
            }
            if(a == 1){
                System.out.println("please input the name: ");
                name = sc.next();
                System.out.println("please input the pass: ");
                pass = sc.next();
                u[leng++] = new User(name,pass);
            }
            if(a==2){
                System.out.println("please input the name");
                name = sc.next();
                System.out.println("please input the pass");
                pass = sc.next();
                int ax = 0;
                for(int i=0;i<leng;i++){
                    ax = u[i].check(name,pass);
                }
                if(ax != 1){
                    System.out.println("the user is wrong");
                }
            }

        }
    }
}
