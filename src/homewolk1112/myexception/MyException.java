package homewolk1112.myexception;

public class MyException extends Exception{
    String msg;
    MyException(){
        msg = "the number < 1000";
    }
    public void getMsg(){
        System.out.println(msg);
    }

}
