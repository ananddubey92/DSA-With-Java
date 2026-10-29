package classs13.arrays1d;

import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        int n=arr.length;
        for (int i=0; i<=n-1; i++){
            System.out.println("Provide input for index " +i);
            arr[i]=sc.nextInt();
        }
        //print
        System.out.println("Your arrays contains: ");
        for(int val: arr){
            System.out.println(val);
        }
    }
}
