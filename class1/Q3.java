package class1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle: ");
        double p=sc.nextDouble();

        System.out.println("Enter rate: ");
        double r=sc.nextDouble();

        System.out.println("Enter time: ");
        double t=sc.nextDouble();

        double si=(p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }
}
