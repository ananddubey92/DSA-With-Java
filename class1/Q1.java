package class1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int result=a*b;
        System.out.println("Multiplication: "+result);
    }
}
