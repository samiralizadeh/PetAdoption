package petsystem;

public class Adopter {

    private String name;

    public Adopter(String name) {
        this.name = name;
    }

    public void adopt(Pet pet) {
        if (pet != null) {
            System.out.println(name + " adopted " + pet);
        }
    }
}
