import jdk.swing.interop.SwingInterOpUtils;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    // The name for the constructor has to match the name of the class; you are creating an instance
    // of the blueprint. This will provide custom information.

    // Parameter: A variable in a function that refers to input data.
    // Argument: A piece of data passed into a function whose value becomes the value of the parameter.

    // f(x, y, z) = x + 1/z - y;
    // Say x = 5;
    // f(5) = 5 + 1 = 6;
    // 10 is our "x" from the main method. We are plugging it in to customMinSpeed.

    public Car() {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println("This is the minSpeed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("Is the car on? " + isTheCarOn);
        System.out.println("What is the car's condition? " + condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
        // if there aren't too many people in the car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            // then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in.");
        } else {
            // otherwise print out the fact the car is full
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

        public void getOut() {
        // numberOfPeopleInCar = numberOfPeopleInCar - 1;
            // if there's people in the car
            if (numberOfPeopleInCar > 0) {
                // then tell one person to get out
                numberOfPeopleInCar--;
            } else {
                // otherwise no one can get out and we'll print that.
                System.out.println("No one is in the car." + numberOfPeopleInCar);
            }
        }

        public double howManyMilesTillOutOfGas() {
            return currentFuel * mpg;
        }

        public double maxMilesPerFillUp() {
            return maxFuel * mpg;
        }

        public void turnTheCarOn() {
            // if the car isn't on...
            if (!isTheCarOn) {
                // turn it on
                isTheCarOn = true;
            } else {
                // otherwise print out the fact it's on
                System.out.println("The car is already on " + isTheCarOn);
            }
        }

        public static void main(String[] args) { // Body shop - where you make things

            Car tommyCar = new Car();
            tommyCar.getOut();
            tommyCar.getOut();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.getIn();
            tommyCar.turnTheCarOn();
            tommyCar.turnTheCarOn();


//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    }
}

