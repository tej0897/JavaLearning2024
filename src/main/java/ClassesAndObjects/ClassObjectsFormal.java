package ClassesAndObjects;

public class ClassObjectsFormal {
    public static void main(String[] args) {
        Person_Formal tejas = new Person_Formal("Tejas", 1, "male");
        Person_Formal mia = new Person_Formal("Mia", 51, "female");
        Person_Formal alex = new Person_Formal("Alex", 11, "male");

        tejas.sleep();
        mia.sleep();
        alex.sleep();
    }
}

class Person_Formal{
    String name;
    int age;
    String gender;

    Person_Formal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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