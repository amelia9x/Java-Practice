package com.company;

import java.util.ArrayList;

public class CompositePattern {
}

// Step 1: Design the interface that defines the overall type
public interface IStructure {
    public void enter();
    public void exit();
    public void location();
    public String getName();
}

// Step 2: Implement the composite class
public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing (String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }

    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " + this.getName() +
                ". It has ");
        for (IStructure struct : this.structures) {
            System.out.println(struct.getName());
        }
    }

    // Print out when you enter and exit the building
    public void enter() { ... }
    public void exit() { ... }
}

// Step 3: Implement the leaf class
public abstract class Room implements IStructure {
    public String name;

    public void enter() {
        System.out.println("You have entered the " + this.name);
    }

    public void exit() {
        System.out.println("You have left the " + this.name);
    }

    public void location() {
        System.out.println("You are currently in the " + this.name);
    }

    public String getName() {
        return this.name;
    }
}

public class Program {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(floor1);

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
        Housing currentFloor = building.getStructure(firstFloor);
        currentFloor.enter();
        Room currentRoom = currentFloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = currentFloor.getStructure(firstCommon);
        currentRoom.enter();
    }
}









































































