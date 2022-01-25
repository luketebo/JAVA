package homewolk1028.Shape;
import java.util.*;
public class Main {
    public static void main(String[] args){
        double a,b,c,d,e,f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the circle center");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("please input the circle radius");
        c = scanner.nextDouble();
        circle ci = new circle(c,a,b);
        ci.center();
        ci.diameter();
        ci.getArea();
        System.out.println("please input the square center");
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        System.out.println("please input the square length ");
        f = scanner.nextDouble();
        square sq =new square(d,e,f);
        sq.center();
        sq.diameter();
        sq.getArea();

    }
}
