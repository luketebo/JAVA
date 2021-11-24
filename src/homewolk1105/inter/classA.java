package homewolk1105.inter;

public class classA implements  InterfaceA{
    @Override
    public int method(int n) {
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += i;
        }
        System.out.println(sum);
        return 0;
    }
}
