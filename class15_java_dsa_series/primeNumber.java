package class15_java_dsa_series;

public class primeNumber {
    static boolean isPrimeOrNot(int num){
        //Prime number should be greater than 1 and divisible by 1 or itself
        //Ex:1->2,3,5,7,11 this is prime number
        //Ex:2->4,6,8,9,10 this is not prime number

        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                //not a prime
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int num=17;
        boolean ans=isPrimeOrNot(num);
        System.out.println(ans);
        //System.out.println(isPrimeOrNot(num));

    }
}
