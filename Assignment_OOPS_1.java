// Parent Abstract Class
abstract class Vehicle {

    int speed = 60;
    long distance = 1000;

    // Default Constructor
    Vehicle() {
        System.out.println("Vehicle Default Constructor Called");
    }

    // Parameterized Constructor
    Vehicle(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }

    // Abstract Methods
    abstract void run();

    abstract void stop();

    // Overloaded fuel methods
    public void fuel(int x) {
        System.out.println("Fuel Method 1 (int): " + x);
    }

    public void fuel(float quantity, String fuelType) {
        System.out.println("Fuel Method 2 (float, String): " +
                quantity + " Liters, Fuel Type: " + fuelType);
    }

    public void fuel(char type, int quantity) {
        System.out.println("Fuel Method 3 (char, int): " +
                type + ", Quantity: " + quantity);
    }
}

// 2W Class
class TwoW extends Vehicle {

    int speed = 80;
    long distance = 2000;
    int no_of_tyre = 2;

    TwoW() {
        System.out.println("2W Default Constructor Called");
    }

    @Override
    void run() {
        System.out.println("2W is Running");
    }

    @Override
    void stop() {
        System.out.println("2W is Stopped");
    }

    void display() {
        System.out.println("\n--- 2W Details ---");
        System.out.println("Child Speed: " + speed);
        System.out.println("Child Distance: " + distance);
        System.out.println("No of Tyres: " + no_of_tyre);
        System.out.println("Parent Speed: " + super.speed);
        System.out.println("Parent Distance: " + super.distance);
    }
}

// 3W Class
class ThreeW extends Vehicle {

    int speed = 70;
    long distance = 3000;
    int no_of_tyre = 3;

    ThreeW() {
        System.out.println("3W Default Constructor Called");
    }

    @Override
    void run() {
        System.out.println("3W is Running");
    }

    @Override
    void stop() {
        System.out.println("3W is Stopped");
    }

    void display() {
        System.out.println("\n--- 3W Details ---");
        System.out.println("Child Speed: " + speed);
        System.out.println("Child Distance: " + distance);
        System.out.println("No of Tyres: " + no_of_tyre);
        System.out.println("Parent Speed: " + super.speed);
        System.out.println("Parent Distance: " + super.distance);
    }
}

// 4W Class
class FourW extends Vehicle {

    int speed = 100;
    long distance = 4000;
    int no_of_tyre = 4;

    FourW() {
        System.out.println("4W Default Constructor Called");
    }

    @Override
    void run() {
        System.out.println("4W is Running");
    }

    @Override
    void stop() {
        System.out.println("4W is Stopped");
    }

    void display() {
        System.out.println("\n--- 4W Details ---");
        System.out.println("Child Speed: " + speed);
        System.out.println("Child Distance: " + distance);
        System.out.println("No of Tyres: " + no_of_tyre);
        System.out.println("Parent Speed: " + super.speed);
        System.out.println("Parent Distance: " + super.distance);
    }
}

// 8W Class
class EightW extends Vehicle {

    int speed = 120;
    long distance = 8000;
    int no_of_tyre = 8;

    EightW() {
        System.out.println("8W Default Constructor Called");
    }

    @Override
    void run() {
        System.out.println("8W is Running");
    }

    @Override
    void stop() {
        System.out.println("8W is Stopped");
    }

    void display() {
        System.out.println("\n--- 8W Details ---");
        System.out.println("Child Speed: " + speed);
        System.out.println("Child Distance: " + distance);
        System.out.println("No of Tyres: " + no_of_tyre);
        System.out.println("Parent Speed: " + super.speed);
        System.out.println("Parent Distance: " + super.distance);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Dynamic Polymorphism
        Vehicle v;

        System.out.println("\n===== 2W =====");
        v = new TwoW();
        v.run();
        v.stop();
        ((TwoW) v).display();

        System.out.println("\n===== 3W =====");
        v = new ThreeW();
        v.run();
        v.stop();
        ((ThreeW) v).display();

        System.out.println("\n===== 4W =====");
        v = new FourW();
        v.run();
        v.stop();
        ((FourW) v).display();

        System.out.println("\n===== 8W =====");
        v = new EightW();
        v.run();
        v.stop();
        ((EightW) v).display();

        // Calling overloaded fuel methods
        System.out.println("\n===== Fuel Methods =====");
        v.fuel(10);
        v.fuel(15.5f, "Petrol");
        v.fuel('D', 20);
    }
}