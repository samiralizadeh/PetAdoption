package petsystem;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
