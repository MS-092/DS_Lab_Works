public class SimpleCar {
    private String name;
    private int maxSpeed;
    private int yearOfMake;

    // Constructor
    public SimpleCar(String name, int maxSpeed, int yearOfMake) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfMake = yearOfMake;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year of Make: " + yearOfMake);
    }

    // Method to accelerate the car
    public void accelerate(int speedIncrement) {
        maxSpeed += speedIncrement;
        System.out.println(name + " accelerated to " + maxSpeed + " km/h");
    }

    // Method to apply brakes to the car
    public void applyBrakes(int speedDecrement) {
        maxSpeed -= speedDecrement;
        System.out.println(name + " slowed down to " + maxSpeed + " km/h");
    }

    // Main function, to define objects and run the 3 methods
    public static void main(String[] args) {
        // Create car objects, with their respective information
        SimpleCar car1 = new SimpleCar("Toyota Camry", 180, 2019);
        SimpleCar car2 = new SimpleCar("Tesla Model S", 250, 2022);

        // Display initial details
        System.out.println("Initial Details:");
        car1.displayDetails();
        car2.displayDetails();
        System.out.println();

        // Accelerate and apply brakes
        car1.accelerate(20); // accelerate the car
        car2.applyBrakes(30); // slowing down the car
        System.out.println();

        // Display details after changes
        System.out.println("Details after changes:");
        car1.displayDetails();
        car2.displayDetails();
    }
}