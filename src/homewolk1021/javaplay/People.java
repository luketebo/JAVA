package homewolk1021.javaplay;

public class People extends Monkey{
    People(){
        super("people");

    };
    public void speak(){
        System.out.println("小样的，不错嘛，会说话了");
    }
    public void think(){
        System.out.println("别说话，认真思考");
    }
}
