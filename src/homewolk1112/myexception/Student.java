package homewolk1112.myexception;

public class Student {
    public static void speak(int array) throws MyException{
        if(array < 1000){
            throw new MyException();
        }
    }
}
