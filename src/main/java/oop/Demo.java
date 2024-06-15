package oop;

public class Demo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Vitz", 2010, 4);
        car.displayInfo();
        MotorBike bike = new MotorBike("Honda", "CBR", 2013);

        System.out.println("-------------------");
        bike.displayInfo();
    }
}
