package petsystem;

import java.util.Objects;

public class Pet {

    private int id;
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getters & setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return "Pet";
    }

    @Override
    public String toString() {
        return getType() + " | name=" + name + ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(getType(), pet.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getType());
    }
}
