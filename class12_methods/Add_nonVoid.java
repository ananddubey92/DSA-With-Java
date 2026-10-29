package class12_methods;

public class Add_nonVoid {
   static int Add(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
       int result= Add(2,5);
        System.out.println("Result: "+result);
    }
}
