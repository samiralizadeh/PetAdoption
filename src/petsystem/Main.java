package petsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dog name: ");
        String name = sc.nextLine();

        System.out.print("Enter dog age: ");
        int age = sc.nextInt();

        Pet dog = new Dog(name, age);

        PetDB.insertPet(dog);
        PetDB.showPets();

        System.out.print("Enter pet ID to update age: ");
        int id = sc.nextInt();

        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();

        PetDB.updateAge(id, newAge);
        PetDB.showPets();
    }
}
