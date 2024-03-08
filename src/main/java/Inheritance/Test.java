package Inheritance;

public class Test extends AA {
    @Override
    public void displayInfo() {
        System.out.println("I am a dd.");
    }
}

class AA {
    public void displayInfo() {
        System.out.println("I am an AA.");
    }
    public void sample() {
        System.out.println("I am sample.");
    }
}

class Main {
    public static void main(String[] args) {
        Test d1 = new Test();
        AA a = new Test();
        //Test d2 = new AA();
        d1.displayInfo();
        d1.sample();
        a.displayInfo();
        //d2.displayInfo();
    }
}
