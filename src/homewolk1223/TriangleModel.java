package homewolk1223;

import java.util.*;
import java.lang.*;

public class TriangleModel {
    public int a;
    public int b;
    public int c;
    public double area;

    public void setA(int a) {
        // Scanner red = new Scanner(System.in);
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void getArea() {
        float p = (a + b + c) / 2;
        area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));

    }

}
