package LoopsPackage;

public class PatternPrint {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        // Write your logic here to return expected patter as string
        String solution="";

        for (int i=0; i<=4;i++){
            String s="";
            for (int j=1; j<=i;j++){
                s=s+"*";
            }
            solution=solution+s+"\n";
        }
        return solution;

    }
}
