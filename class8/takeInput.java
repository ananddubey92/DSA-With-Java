package class8;

import java.util.Scanner;

public class takeInput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a=sc.nextInt();
        System.out.println("Enter a second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is: "+sum);
//        int n=10;
//        for(int i=1; i<=10; i++){
//            n=n+1;
//        }
//        System.out.println(n);
    }
}
