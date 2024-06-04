package vehicle;

public class Car extends Vehicle{
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    protected int accelerate(){
       return 70;
    }

    @Override
    public void printCarDetails(){
        System.out.println(vehicleDetails() + accelerate());
    }

}
