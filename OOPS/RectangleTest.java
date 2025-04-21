class Rectangle{
    double length;
    double width;

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length + width); 
    }

    public boolean isSquare(){
        return length == width;
    }
        
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=2.45;
        r1.width=4.7;

        System.out.println("area: " + r1.area() + "sq.meter");
        System.out.println("perimeter : "+ r1.perimeter() + "meter");
        System.out.println("isSquare: " + r1.isSquare());
    }
    
}
