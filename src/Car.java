import java.util.Scanner;

public class Car {
    private String name;
    private int yearOfMake;
    private int maxSpeed;
    private boolean isRunning;

    // Constructor
    public Car(String name, int yearOfMake, int maxSpeed) {
        this.name = name;
        this.yearOfMake = yearOfMake;
        this.maxSpeed = maxSpeed;
        this.isRunning = false; // Used to see if basically the car is being used or not
    }

    // Method: Apply breaks
    public void applyBreaks() {
        if (isRunning) {
            System.out.println("Applying breaks...");
            isRunning = false;
        } else {
            System.out.println("Cannot apply breaks, the car is not running.");
        }
    }

    // Method: Accelerate
    public void accelerate() {
        if (!isRunning) {
            System.out.println("Accelerating...");
            isRunning = true;
        } else {
            System.out.println("Already running.");
        }
    }

    // Method: Honking the horn
    public void honkHorn() {
        System.out.println("Honking horn...HORN..HORN..HORN");
    }

    // Method: Stop the car
    public void stopCar() {
        if (isRunning) {
            System.out.println("Stopping the car...");
            isRunning = false;
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    // Function for the objects and methods(based on user's inputs)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = null;

        while (true) {
            if (car == null) {
                System.out.println("Choose a car:");
                System.out.println("1. Tesla Model S");
                System.out.println("2. Chevrolet Bolt");
                System.out.println("3. Nissan Leaf");
                System.out.println("4. Exit");

                System.out.print("Enter your choice (1-4): ");
                int choice = scanner.nextInt();

                if (choice ==  4) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                }

                switch (choice) {
                    case  1:
                        car = new Car("Tesla Model S",  2015,  250);
                        break;
                    case  2:
                        car = new Car("Chevrolet Bolt",  2017,  150);
                        break;
                    case  3:
                        car = new Car("Nissan Leaf",  2010,  100);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }

            if (car != null) {
                System.out.println("\nChoose an action for the car:");
                System.out.println("1. Apply Breaks");
                System.out.println("2. Accelerate");
                System.out.println("3. Honk Horn");
                System.out.println("4. Stop Car");
                System.out.println("5. Choose a Different Car");
                System.out.println("6. Exit");

                System.out.print("Enter your action choice (1-6): ");
                int actionChoice = scanner.nextInt();

                if (actionChoice ==  6) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                } else if (actionChoice ==  5) {
                    car = null; // Reset car to null to allow re-selection of the model of the car

                    // Performing nest for this action Choice logic of the car class(action performing loop method)
                } else {
                    switch (actionChoice) {
                        case  1:
                            car.applyBreaks();
                            break;
                        case  2:
                            car.accelerate();
                            break;
                        case  3:
                            car.honkHorn();
                            break;
                        case  4:
                            car.stopCar();
                            break;
                        default:
                            System.out.println("Invalid action choice.");
                            break;
                    }
                }
            }
        }
    }
}