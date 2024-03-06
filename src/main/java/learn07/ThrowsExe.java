package learn07;

import java.util.Scanner;

public class ThrowsExe {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        if(i==0){
            //custom exception
            throw new RuntimeException("i is zero, not divided by zero");
        }
        if(10/i==1){
            System.out.println("i is one");
        }
        else {
            System.out.println("i not one");
        }

    }
}
