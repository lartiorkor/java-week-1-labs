package vehicle;

public abstract class Vehicle {
    private String make;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    private String model;
    private int year;

     protected int accelerate(){
        return 50;
    }

    protected String vehicleDetails(){
         return getMake() + " " + getModel() + " " + getYear();
    }

    public void printCarDetails(){
        System.out.println(vehicleDetails() + accelerate());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
