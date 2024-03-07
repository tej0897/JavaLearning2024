package Constructors;

public class Person extends SuperPerson{
    String name;
    int age;
    String gender;

    public void getSleep(){
        System.out.println("Our man sleeps");
    }

    public Person(){
        System.out.println("Zero Parameters Constructor!!!");
    }
    public Person(String name, int age, String gender){
        this();
        System.out.println("Constructor with 3 parameters");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
