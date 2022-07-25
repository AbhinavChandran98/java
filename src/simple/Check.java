package simple;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num1= sc.nextInt();

        if(num1%2==0)
        {
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }


    }
}
