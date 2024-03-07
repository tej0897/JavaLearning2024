package Constructors;

public class ConstructorsExample {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 22, "male");
        Person mia = new Person("Mia", 33, "female");
        Person david = new Person("David", 21, "male");

        alex.getSleep();
        mia.getSleep();
        david.getSleep();

        Animal tiger = new Animal("Tiger");
        Animal lion = new Animal();

        System.out.println(tiger.name);
        System.out.println(lion.name);
    }
}
