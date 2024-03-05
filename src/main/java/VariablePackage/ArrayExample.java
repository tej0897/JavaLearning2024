package VariablePackage;

public class ArrayExample {
    public static void main(String[] args) {
        int [] myArray = new int[3];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;

        for (int elements : myArray){
            System.out.println(myArray[elements-1]);
        }
    }
}
