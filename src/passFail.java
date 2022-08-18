import java.util.Scanner;

public class passFail {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int finalMark;
        System.out.println("Enter final mark");
        finalMark=in.nextInt();
        if(finalMark>=50){ //If final mark greater or equal to 50, display "PASS" else display "FAIL"
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
