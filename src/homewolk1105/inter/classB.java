package homewolk1105.inter;

public class classB implements InterfaceA{
    public int method(int n){
        if(n<=1){
            return 1;
        }else return n*method(n-1);
    }

}
