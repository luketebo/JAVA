package homewolk1021.plural;
import  java.util.*;
public class plural {
    public int real; //实部
    public int virtual; //虚部
    plural(){
        Scanner read = new Scanner(System.in);
        int a,b;
        System.out.println("请输入该复数的实部");
        a = read.nextInt();
        System.out.println("输入虚部");
        b = read.nextInt();
        real = a;
        virtual = b;
    }
    plural(int x,int y){
        real = x;
        virtual = y;
    }
    //相加
    void add(plural b){
        plural p = new plural(0,0);
        p.real = this.real + b.real;
        p.virtual = this.virtual + b. virtual;
        System.out.println("运算结果：");
        System.out.println(p.real + "+(" + p.virtual + ")i");
    }

    void sub(plural b){
        plural p = new plural(0,0);
        p.real = this.real - b.real;
        p.virtual = this.virtual - b.virtual;
        System.out.println("运算结果:");
        System.out.println(p.real + "+(" + p.virtual + ")i");
    }
    void mul(plural b){
        plural p = new plural(0,0);
        p.real = (this.real * b.real) - (this.virtual * b.virtual);
        p.virtual = (this.virtual * b.real) + (this.real * b.virtual);
        System.out.println("运算结果：");
        System.out.println(p.real + "+(" + p.virtual + ")i");
    }
}
