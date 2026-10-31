package class15_java_dsa_series;

import static class15_java_dsa_series.primeNumber.isPrimeOrNot;

public class allPrimeNumber {
    static void printAllPrimeNum(int num){
        for(int i=2; i<=num; i++){
            boolean isPrime=isPrimeOrNot(i);
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printAllPrimeNum(100);
    }
}
