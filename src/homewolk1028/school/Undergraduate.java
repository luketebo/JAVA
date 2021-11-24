package homewolk1028.school;

public class Undergraduate extends Student{
    String major;
    Undergraduate(String a,int b,String c){
        super(a,b);
        major = c;
    }
    public void show(){
        System.out.println("major:" + major);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
