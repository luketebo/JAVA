/***
 * 计算两个数的最大公约数，如果传递的是负数，就抛出自定义异常
 */
package homewolk1112.computer;

public class Computer {
    public void max(int a,int b){
        int temp = 0;
        if(a < b){
            temp = a;
            a = b;
            b = temp;

        }
        while(a%b != 0){
            temp = a%b;
            a = b;
            b = temp;
        }
        System.out.println("the max:" + temp);
    }
    public static void check(int a,int b) throws MyException{
        if(a < 0|| b<0){
            throw new MyException();
        }
    }

}
