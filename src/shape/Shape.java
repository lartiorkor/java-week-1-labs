package shape;

public class Shape {
    private double length;
    private double width;

    public Shape() {

    }

    public Shape(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2 * length + 2 * width;
    }
}
