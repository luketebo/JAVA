package homewolk1028.school;

public class Student {
    String name;
    int age;
    Student(String sname, int a){
        name = sname;
        age = a;
    }
    public void show(){
        System.out.println("student name: " + name);
        System.out.println("age: " + age);
    }

}
