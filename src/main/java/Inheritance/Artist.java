package Inheritance;

public class Artist extends Human{
    public void paint(){
        System.out.println(name+" is an artist and he paints things");
    }

    public static void main(String[] args) {
        Artist tejas = new Artist();
        tejas.name = "Tejas";
        tejas.age=22;
        tejas.gender="male";
        tejas.paint();
    }
}
