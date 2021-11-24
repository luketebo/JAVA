package homewolk1028.Shape;

public class circle extends shape{
    double radius;
    double  centerx, centery;
    circle(double r, double x, double y){
        radius = r;
        centerx = x;
        centery = y;
    }
    public void center(){
        System.out.println("the center:" + centerx + "," + centery);
    }
    public void diameter(){
        System.out.println("the diameter:" + radius * 3.14 * 2);
    }
    public void getArea(){
        System.out.println("the area:" + radius * radius * 3.14);
    }

}

