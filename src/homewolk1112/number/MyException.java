package homewolk1112.number;

public class MyException extends Exception{
    String msg;
    MyException(){
        msg = "the element is error";
    }
    public void getMsg(){
        System.out.println(msg);
    }
}
