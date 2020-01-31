package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake";
    }

}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(16, "Outlander");
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Facon");
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());


    }



        /*for (int i = 0; i < 5; i++) {
            Car car = randomCar();
            System.out.println(i + "# : \n" + "Name: " + car.getName() + "\nCylinder: " +
                    car.getCylinder() + "\nStart engine: " + car.startEngine() +
                    "\nAccelerate: " + car.accelerate() + "\nisEngine: " + car.isEngine() + "\ngetWheels: " +
                    car.getWheels() + "\n");
        }*/



    /*import java.util.Scanner;

class Car {
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }


    public String startEngine() {
        return "Engine is started";
    }

    public int accelerate() {
        return 1;
    }


    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Honda extends Car {
    public Honda() {
        super("Honda", 6);
    }

    @Override
    public String startEngine() {
        return "Honda.startEngine called";
    }

    @Override
    public int accelerate() {
        return 2;
    }

    @Override
    public boolean isEngine() {
        return false;
    }
}

class Toyota extends Car {
    public Toyota() {
        super("Toyota", 7);
    }

    @Override
    public String startEngine() {
        return "Toyota.startEngine called";
    }

    @Override
    public int accelerate() {
        return 3;
    }

    @Override
    public boolean isEngine() {
        return true;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi() {
        super("Mitsubishi", 8);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi.startEngine called";
    }

    @Override
    public int accelerate() {
        return 4;
    }

    @Override
    public boolean isEngine() {
        return false;
    }
}

class Nissan extends Car {
    public Nissan(int cylinder) {
        super("Nissan", cylinder);
    }
}*/


//import java.util.Scanner;

    /*public static Car randomCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number from 1 to 4");
        boolean isIntOrNot = scanner.hasNextInt();
        if (isIntOrNot) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    return new Honda();
                case 2:
                    return new Toyota();
                case 3:
                    return new Mitsubishi();
                case 4:
                    return new Nissan(9);
            }
        }
        scanner.nextLine();
        scanner.close();
        return null;
    }*/



}


