public class Day6 {

    static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        Car() {
            System.out.println("Car Constructor called");
        }

        Car(String color, String brand, int speed, int fuel) {
            this.color = color;
            this.brand = brand;
            this.speed = speed;
            this.fuel = fuel;
        }

        void accelerate() {
            if (fuel > 0) {
                speed += 10;
                fuel -= 5;
            } else {
                System.out.println("Not enough fuel to accelerate!");
            }
        }

        void decelerate() {
            if (speed >= 10) {
                speed -= 10;
            } else {
                speed = 0;
            }
        }

        void refill(int fuelAmount) {
            fuel += fuelAmount;
        }

        void showFuel() {
            System.out.println(" Fuel level : " + fuel);
        }

        void printDetails() {
            System.out.println(" Color : " + color);
            System.out.println(" Brand : " + brand);
            System.out.println(" Speed : " + speed);
            System.out.println(" Fuel  : " + fuel);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Red", "Toyota", 0, 50);

        car.printDetails();

        System.out.println("\nAfter Accelerating:");
        car.accelerate();
        car.printDetails();

        System.out.println("\nAfter Decelerating:");
        car.decelerate();
        car.printDetails();

        System.out.println("\nAfter Refilling:");
        car.refill(20);
        car.showFuel();
    }
}

