package homewolk1118.digit;
import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an = (int)(Math.random()*100)%100;
        System.out.print("please guess: ");
        int gue = sc.nextInt();
        int time = 10;
        while(time-- > 0){
            if( an > gue){
                System.out.println("bigger!");
                System.out.println("an:" + an);
                System.out.print("["+(10-time)+"/10] try again: ");
                gue = sc.nextInt();

            }else if(an < gue){
                System.out.print("小！");
                System.out.println("an:" + an);
                System.out.println("["+(10-time)+"/10] try again: ");
                gue = sc.nextInt();

            }else{
                System.out.println("right!");
                System.out.println("an:" + an);
                sc.close();
                return;
            }

        }
        System.out.println("the chance end! ");
        sc.close();
    }
}
