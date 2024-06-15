package oop;

public class MotorBike extends Vehicle {
    private boolean hasCarrier;

    public MotorBike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {

    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + this.isHasCarrier());
    }
}
