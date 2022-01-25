package homewolk1118.time;
import java.text.SimpleDateFormat;
import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sim = new SimpleDateFormat("yyy.MM.dd");
        System.out.println("请输入开始“三天打鱼两天晒网”的日期：");
        String start = sc.next();
        System.out.println("请输入结束的日期：");
        String end = sc.next();
        try {
            Date d1 = sim.parse(start);
            Date d2 = sim.parse(end);
            long d3 = (d2.getTime() - d1.getTime())/1000/60/60/24;
            if(d3 % 5 == 0 || d3 % 5 == 1)
            {
                System.out.println(end +"是晒网日");
            }else{
                System.out.println(end + "是大渔日");
            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
