package homewolk1112.computer;

public class MyException extends Exception{
    String msg;
    MyException(){
        msg = "the number < 0";
    }
    public void getMsg(){
        System.out.println(msg);
    }
}
