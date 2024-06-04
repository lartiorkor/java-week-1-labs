package vehicle;

public class Bike extends Vehicle{
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    protected int accelerate(){
        return 60;
    }

    @Override
    public void printCarDetails(){
        System.out.println(vehicleDetails() + accelerate());
    }
}
