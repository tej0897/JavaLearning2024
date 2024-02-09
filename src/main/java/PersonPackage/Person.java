package PersonPackage;

public class Person {
    public String name;
    public int age;
    public String gender;

    public void sleep(){
        if (age <= 10){
            System.out.println(name + " sleeps for 10+ hours a day.");
        } else if(age <=50){
            System.out.println(name + " sleeps for 10 hours a day.");
        } else {
            System.out.println(name + " sleeps less than 10 hours a day.");
        }
    }
}
