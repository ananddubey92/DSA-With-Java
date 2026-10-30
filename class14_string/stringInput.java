package class14_string;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the string content 1: ");
        String str=sc.nextLine();
        System.out.println("Value of nextLine: " + str);
        System.out.println("Provide the string content 2: ");
        String str2=sc.next();
        System.out.println("Value of next: " + str2);
    }
}
