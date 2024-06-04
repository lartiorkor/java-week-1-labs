package task_5;

import java.util.Scanner;

public class Area {
        private double length;
        private double breadth;

        public Area(double length, double breadth){
            setLength(length);
            setBreadth(breadth);
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getBreadth() {
            return breadth;
        }

        public void setBreadth(double breadth) {
            this.breadth = breadth;
        }

        public double returnArea(){
            return 0.5 * getLength() * getBreadth();
        }

        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter length (height): ");
                double heightValue = scanner.nextDouble();

                System.out.println("Enter width (base): ");
                double baseValue = scanner.nextDouble();

                Area rectangle = new Area(heightValue, baseValue);
                System.out.println("Area of rectangle: " + rectangle.returnArea());

            } catch (Exception exception){
                System.out.println("Enter a number");
            }
            scanner.close();
        }
}
