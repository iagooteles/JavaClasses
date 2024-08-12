package br.edu.mystudies.animal_Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("vira lata", 20, "rounded", "pointed");
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrado retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
