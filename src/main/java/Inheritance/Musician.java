package Inheritance;

public class Musician extends Human{

    public void makeMusic(){
        System.out.println(name+" is a Musician and he produces music.");
    }

    public void speak(){
        System.out.println("Musicians speak too?");
    }

    public static void main(String[] args) {
       Musician musician = new Musician();
       musician.name="Ed";
       musician.age=55;
       musician.gender="male";

       musician.makeMusic();
       musician.speak();
    }
}
