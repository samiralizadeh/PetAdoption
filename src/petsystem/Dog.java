package petsystem;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
