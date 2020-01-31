package com.company;

public class FactoryMethodPattern {

}

// Example 1
Knife orderKnife(String knifeType) {
    Knife knife;

    // create Knife object - concrete instantiation
    if(knifeType.equals("steak")) {
        knife = new SteakKnife();
    } else if (knifeType.equals("chefs")) {
        knife = new ChefsKnife();
    }

    // prepare the Knife
    knife.sharpen();
    knife.polish();
    knife.package();

    return knife;
}

// Then move to next
public class KnifeFactory {
    public Knife createKnife(String knifeType) {
        Knife knife = null;

        // create Knife object
        if(knifeType.equals("steak")) {
            knife = new SteakKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new ChefsKnife();
        }
        return knife;
    }
}

// Example with factory
public class KnifeStore {
    private KnifeFactory factory;

    // require a KnifeFactory object to be passed to
    // this constructor:
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;

        // use the create method in the factory
        knife = factory.createKnife(knifeType);

        // prepare the Knife
        knife.sharpen();
        knife.polish();
        knife.package();

        return knife;
    }
}

// Factory method pattern
public abstract class KnifeStore{
    public Knife orderKnife(String knifeType) {
        Knife knife;

        // now creating a knife is a method in the class
        knife = factory.createKnife(knifeType);

        // this is still the same as before
        knife.sharpen();
        knife.polish();
        knife.package();

        return knife;
    }
    abstract Knife createKnife(String knifeType);
}

public class BudgetKnifeStore extends KnifeStore {

    // up to any subclass of KnifeStore to define this method
    Knife createKnife(String knifeType) {
        if(knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            return new BudgetChefsKnife();
        }
        // .. more types
        else return null;
    }
}
















































