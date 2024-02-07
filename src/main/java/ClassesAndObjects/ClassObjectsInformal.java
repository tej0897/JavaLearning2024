package ClassesAndObjects;

public class ClassObjectsInformal {
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

class Person{
    String name;
    int age;
    String gender;

    void sleep(){
        if (age <= 10){
            System.out.println(name + " sleeps for 10+ hours a day.");
        } else if(age <=50){
            System.out.println(name + " sleeps for 10 hours a day.");
        } else {
            System.out.println(name + " sleeps less than 10 hours a day.");
        }
    }
}
