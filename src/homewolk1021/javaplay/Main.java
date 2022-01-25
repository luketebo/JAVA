package homewolk1021.javaplay;

public class Main {
    public static void main(String[] args) {
        Monkey mon = new Monkey("root");
        People peo = new People();
        mon.speak();
        peo.speak();
        peo.think();
    }

}
