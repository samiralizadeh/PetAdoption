package petsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dog name: ");
        String dogName = sc.nextLine();

        System.out.print("Enter dog age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();

        Pet dog = new Dog(dogName, dogAge);

        System.out.print("Enter cat name: ");
        String catName = sc.nextLine();

        System.out.print("Enter cat age: ");
        int catAge = sc.nextInt();

        Pet cat = new Cat(catName, catAge);

        Shelter shelter = new Shelter();
        shelter.addPet(dog);
        shelter.addPet(cat);

        System.out.println("\nAll pets in shelter:");
        shelter.showPets();

        System.out.println("\nOnly dogs:");
        shelter.showDogs();

        shelter.sortByName();
        System.out.println("\nSorted pets:");
        shelter.showPets();

        Adopter adopter = new Adopter("John");

        Pet found = shelter.findPet(catName);
        adopter.adopt(found);

        Pet test1 = new Dog("Rex", 3);
        Pet test2 = new Dog("Rex", 3);

        System.out.println("\nObject comparison:");
        System.out.println(test1.equals(test2));

        PetDB.insertPet(dog);
        PetDB.insertPet(cat);

        System.out.println("\nPets from database:");
        PetDB.showPets();

        System.out.print("\nEnter pet ID to update age: ");
        int id = sc.nextInt();

        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();

        PetDB.updateAge(id, newAge);

        System.out.println("\nUpdated database:");
        PetDB.showPets();
    }
}
