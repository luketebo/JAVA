package homewolk1105.test;

public class B extends A{
    void showA(){
        System.out.println("大写");
        for(int i = 0;i<26;i++){
            char ch = 'A';

            System.out.print((char)(ch + i) + " ");
        }
    }

}
