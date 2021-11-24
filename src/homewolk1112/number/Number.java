package homewolk1112.number;

public class Number {
    public void count(float a,float b){
        //可以得到任何两个数相乘的结果
        System.out.println("the result:" + a*b );
    }

    public static void check(float a,float b) throws MyException {
        if(a == 0 || b ==0){
            throw new MyException();

        }

    }
}
