package LoopsPackage;

public class TwoTable {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        String finalStr = "";
        // Write the loop logic here. and assign finalStr at end of all iteration
        for (int i=1; i<11; i++){
            finalStr=finalStr+ "2 * " +i+" = " +2*i+"\n";
        }
        return finalStr;
    }


}
