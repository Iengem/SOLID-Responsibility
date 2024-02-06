public class SolidApplications {

    //Single Responsibility Principle
    public class Adder{
        public int add(int x, int y){
            return x + y;
        }
    }

    // Open/Closed Principle
    interface Printable {
        void printMessage(String message);
    }

    class Printer implements Printable {
        @Override
        public void printMessage(String message) {
            System.out.println("Printing: " + message);
        }
    }

    class ErrorPrinter implements Printable {
        @Override
        public void printMessage(String errorMessage) {
            System.err.println("Error: " + errorMessage);
        }
    }


    // Liskov Substitution Principle
    class Animal {
        void Moving() {
            System.out.println("Running...");
        }
    }

    class dog extends Animal {

    }

    class Fish extends Animal {
        void swim() {
            System.out.println("Swimming...");
        }
    }

    // Interface Segregation Principle
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }


    class Robot implements Workable {
        @Override
        public void work() {

        }
    }

    // Dependency Inversion Principle
    class LightBulb {
        void turnOn() {

        }

        void turnOff() {

        }
    }

    interface Switch {
        void operate(LightBulb bulb);
    }

    class RemoteControl implements Switch {
        @Override
        public void operate(LightBulb bulb) {

        }
    }

}