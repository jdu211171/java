public class Car {
    // Instance variables
    String make;     // Make of the car
    String model;    // Model of the car
    int year;        // Year of manufacturing
    double price;    // Price of the car

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Instance method using instance variables
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0);

        Car myCar2 = myCar;
        myCar2.make = "Honda";
        // Using the instance method to display car information
        myCar.displayCarInfo();
    }
}
