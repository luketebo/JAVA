package homewolk1105.inter;

public class Main {
    public static void main(String[] args) {
        InterfaceA inA;
        inA = new classA();
        inA.method(13);
        InterfaceA inB;
        inB = new classB();
        int a;
        a = inB.method(4);
        System.out.println(a);
    }
}
