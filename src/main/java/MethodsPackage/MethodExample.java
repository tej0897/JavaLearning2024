package MethodsPackage;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        System.out.println(example.printHello("male"));
    }

    public String printHello(String gender){
        if (gender.equalsIgnoreCase("Male")){
            return "Hello Sir";
        } else if (gender.equalsIgnoreCase("Female")){
            return "Hello Madam";
        } else{
            return "Hello";
        }
    }
}


