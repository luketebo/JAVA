package homewolk1028.Shape;

public class square extends shape{
    double centerx, centery;
    double length;
    double area;
    square(double x, double y, double l){

        centerx = x ;
        centery = y ;
        length = l;
    }
    public void center(){
        System.out.println("the center:" + centerx + "," + centery);
    }
    public void getArea(){
        area =  length * length;
        System.out.println("the area:" + area);
    }
    public void diameter(){
        System.out.println("the diameter:" + (length + length) * 2 );
    }
}
