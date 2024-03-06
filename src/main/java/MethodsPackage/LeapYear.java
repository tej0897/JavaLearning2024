package MethodsPackage;

public class LeapYear {
    public static void main(String[] args) {
        int userInput = 2048;
        System.out.println(isLeapYear(userInput) );
    }

    public static String isLeapYear(int year){
        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
            return "is a leap year!";
        }else {
            return "not a leap year.";
        }
    }
}
