package simple;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        System.out.println("before swap num1= "+num1+" num2= "+num2);

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping  num1= "+num1+" num2= "+num2);


    }
}
