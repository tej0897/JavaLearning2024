package ClassesAndObjects;

import PersonPackage.Person;

public class ExampleOne {
    public static void main(String[] args) {
        Person tejas = new Person();
        tejas.age=1;
        tejas.name="Tejas";
        tejas.gender="male";
        tejas.sleep();

        Person alex = new Person();
        alex.age=11;
        alex.name="Alex";
        alex.gender="male";
        alex.sleep();

        Person mia = new Person();
        mia.age=61;
        mia.name="Mia";
        mia.gender="female";
        mia.sleep();

    }
}


