package simple;

import java.util.Scanner;

public class Eg1 {
    String empName;
    String empCode;
    String designation;
    int salary;


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Eg1 ob=new Eg1();

        System.out.println("Enter the name");
        ob.empName=sc.next();
        System.out.println("Enter the code");
        ob.empCode=sc.next();
        System.out.println("Enter the designation");
        ob.designation=sc.next();
        System.out.println("Entre the salary");
        ob.salary=sc.nextInt()
        ;

        System.out.println(ob.empName);
        System.out.println(ob.empCode);
        System.out.println(ob.designation);
        System.out.println(ob.salary);
    }
}
