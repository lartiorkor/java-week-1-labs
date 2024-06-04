package shape;

public class Rectangle extends Shape{
    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public double calculateArea(){
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter(){
        return 2 * getLength() + 2 * getWidth();
    }

}
