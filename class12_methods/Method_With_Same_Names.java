package class12_methods;

public class Method_With_Same_Names {
    static int add(int a, int b){
        int sum=a+b;
        return sum;
        //return a+b;
    }
    static int add(int a, int b, int c){
        int sum=a+b+c;
        return sum;
        //return a+b+c;
    }
    static void solve(int num){
        System.out.println("Inside solve : "+num);
        num=num*10;
        System.out.println("Inside solve : "+num);
    }
    //Variable Scoping
    static void printMultiples(){
        int value=20;
        for(int i=1; i<=10; i++){
            System.out.println(20*i);
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        printMultiples();
//        int num=5;
//        System.out.println("Inside main : "+num);
//        solve(num);
//        System.out.println("Inside main : "+num);
//        int ans1=add(2,3);
//        System.out.println("Ans1: "+ans1);
//        int ans2=add(2,3,4);
//        System.out.println("Ans2: "+ans2);
//        System.out.println(add(2,3));
//        System.out.println(add(2,3,4));
    }
}
