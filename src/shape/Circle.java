package shape;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        super();
        setRadius(radius);
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * getRadius();
    }
}
